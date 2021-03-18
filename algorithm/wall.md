# 성곽

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞은 사람 | 정답 비율 |
| :-------- | :---------- | :--- | :--- | :-------- | :-------- |
| 2 초      | 128 MB      | 5787 | 2524 | 1771      | 42.933%   |



## 문제

![img](https://www.acmicpc.net/JudgeOnline/upload/201008/cas.PNG)

대략 위의 그림과 같이 생긴 성곽이 있다. 굵은 선은 벽을 나타내고, 점선은 벽이 없어서 지나다닐 수 있는 통로를 나타낸다. 이러한 형태의 성의 지도를 입력받아서 다음을 계산하는 프로그램을 작성하시오.

1. 이 성에 있는 방의 개수
2. 가장 넓은 방의 넓이
3. 하나의 벽을 제거하여 얻을 수 있는 가장 넓은 방의 크기

위의 예에서는 방은 5개고, 가장 큰 방은 9개의 칸으로 이루어져 있으며, 위의 그림에서 화살표가 가리키는 벽을 제거하면 16인 크기의 방을 얻을 수 있다.

성은 m×n(1 ≤ m, n ≤ 50)개의 정사각형 칸으로 이루어진다. 성에는 최소 두 개의 방이 있어서, 항상 하나의 벽을 제거하여 두 방을 합치는 경우가 있다.



## 입력

첫째 줄에 두 정수 n, m이 주어진다. 다음 m개의 줄에는 n개의 정수로 벽에 대한 정보가 주어진다. 벽에 대한 정보는 한 정수로 주어지는데, 서쪽에 벽이 있을 때는 1을, 북쪽에 벽이 있을 때는 2를, 동쪽에 벽이 있을 때는 4를, 남쪽에 벽이 있을 때는 8을 더한 값이 주어진다. 참고로 이진수의 각 비트를 생각하면 쉽다. 따라서 이 값은 0부터 15까지의 범위 안에 있다.



## 출력

첫째 줄에 1의 답을, 둘째 줄에 2의 답을, 셋째 줄에 3의 답을 출력한다.



## 예제 입력 

```
7 4
11 6 11 6 3 10 6
7 9 6 13 5 15 5
1 10 12 7 13 7 5
13 11 10 8 10 12 13
```



## 예제 출력 

```
5
9
16
```





```cpp

#include <iostream>
#include <cstdlib>
#include <vector>
#include <queue>
#include <bitset>
#include <unordered_map>

using namespace std;

int n,m;

vector<bitset<4> > line(51);
vector<vector<bitset<4> > >  matrix(51, line);
queue<pair<int, int> > q;
int rooms[51][51];
bool visited[51][51];
int dx[] = {0,0,-1,1};
int dy[] = {-1,1,0,0};
int room_cnt = 0;
int max_sz = 0;
unordered_map<int, int> room_sz;

void prtArr()
{
    cout << "===========" << '\n';
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            cout << rooms[i][j] << ' ';
        }
        cout << '\n';
    }
}

void bfs()
{
    room_cnt++;
    int cur_room_sz = 0;
    while (!q.empty())
    {
        int r = q.front().first;
        int c = q.front().second;
        cur_room_sz++;
        rooms[r][c] = room_cnt;

        q.pop();

        // i가 0 : 9시 / 1:3시 / 2 : 12시 / 3 : 6시
        int mr, mc;
        if(matrix[r][c][0]==0)
        {
            mr=r+dx[0];
            mc=c+dy[0];
            if(mr>-1 && mr<n && mc>-1 && mr<m)
            {
                if(!visited[mr][mc])
                {
                    visited[mr][mc] = 1;
                    q.push({mr,mc});
                }
            }
        }

        if(matrix[r][c][1]==0)
        {
            mr=r+dx[2];
            mc=c+dy[2];
            if(mr>-1 && mr<n && mc>-1 && mr<m)
            {
                if(!visited[mr][mc])
                {
                    visited[mr][mc] = 1;
                    q.push({mr,mc});
                }
            }
        }

        if(matrix[r][c][2]==0)
        {
            mr=r+dx[1];
            mc=c+dy[1];

            if(mr>-1 && mr<n && mc>-1 && mr<m)
            {
                if(!visited[mr][mc])
                {
                    visited[mr][mc] = 1;
                    q.push({mr,mc});
                }
            }
        }

        if(matrix[r][c][3]==0)
        {
            mr=r+dx[3];
            mc=c+dy[3];
            if(mr>-1 && mr<n && mc>-1 && mr<m)
            {
                if(!visited[mr][mc])
                {
                    visited[mr][mc] = 1;
                    q.push({mr,mc});
                }
            }
        }
        if(cur_room_sz>1300000) cout << r <<' '<< c << '\n';
    }
    max_sz = max(max_sz,cur_room_sz);
    room_sz.insert({room_cnt, cur_room_sz});
}

int main()
{
    ios_base :: sync_with_stdio(0);
    cin.tie(NULL);cout.tie(NULL);

    cin >> m >> n;

    int input;

    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            cin >> input;
            matrix[i][j] = bitset<4>(input);
        }
    }

    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            if(!visited[i][j]) 
            {
                q.push({i,j});
                visited[i][j] = 1;
                bfs();
            }
        }
    }

    int sum_max = 0;
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            if(j+1<m)
            {
                if(rooms[i][j]!=rooms[i][j+1])
                {
                    sum_max = max(sum_max,room_sz[rooms[i][j]]+room_sz[rooms[i][j+1]]);   
                }
            }
            if(i+1<n)
            {
                if(rooms[i][j]!=rooms[i+1][j])
                {
                    sum_max = max(sum_max,room_sz[rooms[i][j]]+room_sz[rooms[i+1][j]]);   
                }        
            }
        }
    }

    cout << room_cnt << '\n' << max_sz << '\n' << sum_max;
}
```

