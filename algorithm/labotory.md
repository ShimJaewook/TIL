# 연구소 성공

| 시간 제한 | 메모리 제한 | 제출  | 정답  | 맞은 사람 | 정답 비율 |
| :-------- | :---------- | :---- | :---- | :-------- | :-------- |
| 2 초      | 512 MB      | 37646 | 21571 | 11700     | 54.647%   |



## 문제

인체에 치명적인 바이러스를 연구하던 연구소에서 바이러스가 유출되었다. 다행히 바이러스는 아직 퍼지지 않았고, 바이러스의 확산을 막기 위해서 연구소에 벽을 세우려고 한다.

연구소는 크기가 N×M인 직사각형으로 나타낼 수 있으며, 직사각형은 1×1 크기의 정사각형으로 나누어져 있다. 연구소는 빈 칸, 벽으로 이루어져 있으며, 벽은 칸 하나를 가득 차지한다. 

일부 칸은 바이러스가 존재하며, 이 바이러스는 상하좌우로 인접한 빈 칸으로 모두 퍼져나갈 수 있다. 새로 세울 수 있는 벽의 개수는 3개이며, 꼭 3개를 세워야 한다.

예를 들어, 아래와 같이 연구소가 생긴 경우를 살펴보자.

```
2 0 0 0 1 1 0
0 0 1 0 1 2 0
0 1 1 0 1 0 0
0 1 0 0 0 0 0
0 0 0 0 0 1 1
0 1 0 0 0 0 0
0 1 0 0 0 0 0
```

이때, 0은 빈 칸, 1은 벽, 2는 바이러스가 있는 곳이다. 아무런 벽을 세우지 않는다면, 바이러스는 모든 빈 칸으로 퍼져나갈 수 있다.

2행 1열, 1행 2열, 4행 6열에 벽을 세운다면 지도의 모양은 아래와 같아지게 된다.

```
2 1 0 0 1 1 0
1 0 1 0 1 2 0
0 1 1 0 1 0 0
0 1 0 0 0 1 0
0 0 0 0 0 1 1
0 1 0 0 0 0 0
0 1 0 0 0 0 0
```

바이러스가 퍼진 뒤의 모습은 아래와 같아진다.

```
2 1 0 0 1 1 2
1 0 1 0 1 2 2
0 1 1 0 1 2 2
0 1 0 0 0 1 2
0 0 0 0 0 1 1
0 1 0 0 0 0 0
0 1 0 0 0 0 0
```

벽을 3개 세운 뒤, 바이러스가 퍼질 수 없는 곳을 안전 영역이라고 한다. 위의 지도에서 안전 영역의 크기는 27이다.

연구소의 지도가 주어졌을 때 얻을 수 있는 안전 영역 크기의 최댓값을 구하는 프로그램을 작성하시오.



## 입력

첫째 줄에 지도의 세로 크기 N과 가로 크기 M이 주어진다. (3 ≤ N, M ≤ 8)

둘째 줄부터 N개의 줄에 지도의 모양이 주어진다. 0은 빈 칸, 1은 벽, 2는 바이러스가 있는 위치이다. 2의 개수는 2보다 크거나 같고, 10보다 작거나 같은 자연수이다.

빈 칸의 개수는 3개 이상이다.



## 출력

첫째 줄에 얻을 수 있는 안전 영역의 최대 크기를 출력한다.



## 예제 입력 1 

```
7 7
2 0 0 0 1 1 0
0 0 1 0 1 2 0
0 1 1 0 1 0 0
0 1 0 0 0 0 0
0 0 0 0 0 1 1
0 1 0 0 0 0 0
0 1 0 0 0 0 0
```



## 예제 출력 1 

```
27
```



## 예제 입력 2 

```
4 6
0 0 0 0 0 0
1 0 0 0 0 2
1 1 1 0 0 2
0 0 0 0 0 2
```



## 예제 출력 2 

```
9
```



## 예제 입력 3 

```
8 8
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
2 0 0 0 0 0 0 2
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
```



## 예제 출력 3 

```
3
```



### 풀이

```cpp
#include <iostream>
#include <cstdlib>
#include <vector>
#include <queue>

using namespace std;

int matrix[9][9];
vector<pair<int,int> >  empty_space;
queue<pair<int, int> > virus_p;
queue<pair<int, int> > q;

bool default_visited[9][9];
bool visited[9][9];

int dx[] = {0,0,-1,1};
int dy[] = {-1,1,0,0};

int n, m;
int safeZ = 0;
int maxSafeZ = -1;

void printArr()
{
    cout << "==============" << '\n';
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            cout << matrix[i][j];
        }
        cout << '\n';
    }
}

void bfs()
{
    q=virus_p;
    int cur_safeZ = safeZ;

    copy(&default_visited[0][0], &default_visited[0][0]+9*9, &visited[0][0]);
    while(!q.empty())
    {
        int x = q.front().first;
        int y = q.front().second;

        q.pop();

        for(int i=0; i<4; ++i)
        {
            if(x+dx[i]>-1 && x+dx[i]<n && y+dy[i]>-1 && y+dy[i]<m)
            {
                if(visited[x+dx[i]][y+dy[i]]==0 && matrix[x+dx[i]][y+dy[i]]==0)
                {
                    cur_safeZ--;
                    q.push({x+dx[i],y+dy[i]});
                    visited[x+dx[i]][y+dy[i]] = 1;
                }
            }
        }
    }
    maxSafeZ = max(maxSafeZ, cur_safeZ);

}

int main()
{
    ios_base :: sync_with_stdio(0);
    cin.tie(NULL); cout.tie(NULL);

    cin >> n >> m;

    int input;

    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            cin >> input;
            if(input==0) 
            {
                safeZ++;
                empty_space.push_back({i,j});
            }
            if(input==2) 
            {
                default_visited[i][j] = 1;
                virus_p.push({i, j});
            }
            matrix[i][j] = input;
        }
    }


    int empty_sz = empty_space.size();

    for(int i=0; i<empty_sz-2; ++i)
    {
        matrix[empty_space[i].first][empty_space[i].second] =1;
        for(int j=i+1; j<empty_sz-1; ++j)
        {
            matrix[empty_space[j].first][empty_space[j].second] =1;
            for(int k=j+1; k<empty_sz; ++k)
            {
                matrix[empty_space[k].first][empty_space[k].second] =1;
            
                // printArr();
                bfs();

                matrix[empty_space[k].first][empty_space[k].second] =0;
            }
            matrix[empty_space[j].first][empty_space[j].second] =0;
        }
        matrix[empty_space[i].first][empty_space[i].second] =0;
    }

    cout << maxSafeZ-3;
}
```
