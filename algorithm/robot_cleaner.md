# 로봇 청소기

| 시간 제한 | 메모리 제한 | 제출  | 정답  | 맞은 사람 | 정답 비율 |
| :-------- | :---------- | :---- | :---- | :-------- | :-------- |
| 2 초      | 512 MB      | 26852 | 14282 | 9267      | 52.200%   |



## 문제

로봇 청소기가 주어졌을 때, 청소하는 영역의 개수를 구하는 프로그램을 작성하시오.

로봇 청소기가 있는 장소는 N×M 크기의 직사각형으로 나타낼 수 있으며, 1×1크기의 정사각형 칸으로 나누어져 있다. 각각의 칸은 벽 또는 빈 칸이다. 청소기는 바라보는 방향이 있으며, 이 방향은 동, 서, 남, 북중 하나이다. 지도의 각 칸은 (r, c)로 나타낼 수 있고, r은 북쪽으로부터 떨어진 칸의 개수, c는 서쪽으로 부터 떨어진 칸의 개수이다.

로봇 청소기는 다음과 같이 작동한다.

1. 현재 위치를 청소한다.
2. 현재 위치에서 현재 방향을 기준으로 왼쪽방향부터 차례대로 탐색을 진행한다.
   1. 왼쪽 방향에 아직 청소하지 않은 공간이 존재한다면, 그 방향으로 회전한 다음 한 칸을 전진하고 1번부터 진행한다.
   2. 왼쪽 방향에 청소할 공간이 없다면, 그 방향으로 회전하고 2번으로 돌아간다.
   3. 네 방향 모두 청소가 이미 되어있거나 벽인 경우에는, 바라보는 방향을 유지한 채로 한 칸 후진을 하고 2번으로 돌아간다.
   4. 네 방향 모두 청소가 이미 되어있거나 벽이면서, 뒤쪽 방향이 벽이라 후진도 할 수 없는 경우에는 작동을 멈춘다.

로봇 청소기는 이미 청소되어있는 칸을 또 청소하지 않으며, 벽을 통과할 수 없다.



## 입력

첫째 줄에 세로 크기 N과 가로 크기 M이 주어진다. (3 ≤ N, M ≤ 50)

둘째 줄에 로봇 청소기가 있는 칸의 좌표 (r, c)와 바라보는 방향 d가 주어진다. d가 0인 경우에는 북쪽을, 1인 경우에는 동쪽을, 2인 경우에는 남쪽을, 3인 경우에는 서쪽을 바라보고 있는 것이다.

셋째 줄부터 N개의 줄에 장소의 상태가 북쪽부터 남쪽 순서대로, 각 줄은 서쪽부터 동쪽 순서대로 주어진다. 빈 칸은 0, 벽은 1로 주어진다. 지도의 첫 행, 마지막 행, 첫 열, 마지막 열에 있는 모든 칸은 벽이다.

로봇 청소기가 있는 칸의 상태는 항상 빈 칸이다.



## 출력

로봇 청소기가 청소하는 칸의 개수를 출력한다.



## 예제 입력 1

```
3 3
1 1 0
1 1 1
1 0 1
1 1 1
```



## 예제 출력 1

```
1
```



## 예제 입력 2 

```
11 10
7 4 0
1 1 1 1 1 1 1 1 1 1
1 0 0 0 0 0 0 0 0 1
1 0 0 0 1 1 1 1 0 1
1 0 0 1 1 0 0 0 0 1
1 0 1 1 0 0 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 0 1 1 0 1
1 0 0 0 0 0 1 1 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1
```



## 예제 출력 2 

```
57
```



### 풀이

```cpp
#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

// 좌 밑 우 위
int dx[]={0,1,0,-1};
int dy[]={-1,0,1,0};
//빠꾸
int back[]={2,3,0,1};

int N,M;

int matrix[51][51];
int v[51][51];

struct robot
{
    int dir;
    int x;
    int y;
};

int turn_dir(int dir)
{
    if(dir==3) return 0;
    return dir+1;
}

int cleaning(robot& bot)
{
    int count = 1;

    int& dir = bot.dir;
    int dir_count;

    while(true)
    {
        dir_count = 0;
        int &cur_x = bot.x;
        int &cur_y = bot.y;
        int start_dir = dir;
        while(dir_count<4)
        {
            dir = turn_dir(dir);
            int far_x = cur_x+dx[dir];
            int far_y = cur_y+dy[dir];
            //이동 가능
            if(far_x>0 && far_x<N && far_y>0 && far_y<M && matrix[far_x][far_y]!=1 && v[far_x][far_y]==0)
            {   
                count++;
                v[far_x][far_y]=count;
                dir_count=0;
                cur_x = far_x;
                cur_y = far_y;
                start_dir=dir;
                // cout << "==============" << '\n';
                // for(int i=0; i<N; ++i)
                // {
                //     for(int j=0; j<M; ++j)
                //     {
                //         cout << v[i][j]<<' ';
                //     }
                //     cout << '\n';
                // }
                continue;
            }
            //이동 불가거나 이미 청소했음
            else
            {
                // cout << "dir_count : " << dir_count << "  dir: " << dir << '\n';
                // dir = turn_dir(dir);
                dir_count++;
            }
        }


        //네 방향 다 이동 불가. 처음 진입 방향을 기억해둠.
        dir = start_dir;
        int back_dir = back[dir];
        cur_x += dx[back_dir];
        cur_y += dy[back_dir];
        
        //후진한게 범위를 벗어나면 
        if(cur_x<0 || cur_x>N || cur_y<0 || cur_y>M)
            return count;
        //후진한게 벽이라면
        if(matrix[cur_x][cur_y]==1)
            return count;
        // cout << "NEXT step" << '\n';
    }
}

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(NULL); cout.tie(NULL);

    cin >> N >> M;

    robot bot;

    int temp_dir;
    cin >> bot.x >> bot.y >> temp_dir;

    if(temp_dir==0) bot.dir=3;
    if(temp_dir==1) bot.dir=2;
    if(temp_dir==2) bot.dir=1;
    if(temp_dir==3) bot.dir=0;    

    v[bot.x][bot.y]=1;

    int input;
    for(int i=0; i<N; ++i)
    {
        for(int j=0; j<M; ++j)
        {
            cin >> input;
            matrix[i][j] = input;
        }
    }

    //청소 시작
    int answer = cleaning(bot);

    cout << answer;
}
```

