# 미친 로봇 성공스페셜 저지분류

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞은 사람 | 정답 비율 |
| :-------- | :---------- | :--- | :--- | :-------- | :-------- |
| 1 초      | 128 MB      | 6396 | 2365 | 1622      | 33.347%   |



## 문제

통제 할 수 없는 미친 로봇이 평면위에 있다. 그리고 이 로봇은 N번의 행동을 취할 것이다.

각 행동에서 로봇은 4개의 방향 중에 하나를 임의로 선택한다. 그리고 그 방향으로 한 칸 이동한다.

로봇이 같은 곳을 한 번보다 많이 이동하지 않을 때, 로봇의 이동 경로가 단순하다고 한다. (로봇이 시작하는 위치가 처음 방문한 곳이다.) 로봇의 이동 경로가 단순할 확률을 구하는 프로그램을 작성하시오. 예를 들어, EENE와 ENW는 단순하지만, ENWS와 WWWWSNE는 단순하지 않다. (E는 동, W는 서, N은 북, S는 남)



## 입력

첫째 줄에 N, 동쪽으로 이동할 확률, 서쪽으로 이동할 확률, 남쪽으로 이동할 확률, 북쪽으로 이동할 확률이 주어진다. N은 14보다 작거나 같은 자연수이고, 모든 확률은 100보다 작거나 같은 자연수 또는 0이다. 그리고, 동서남북으로 이동할 확률을 모두 더하면 100이다.

확률의 단위는 %이다.



## 출력

첫째 줄에 로봇의 이동 경로가 단순할 확률을 출력한다. 절대/상대 오차는 10-9 까지 허용한다.



## 예제 입력 1 

```
2 25 25 25 25
```



## 예제 출력 1 

```
0.75
```



### 풀이

```cpp
#include <iostream>
#include <cstdlib>
#include <vector>
#include <iomanip>
#include <algorithm>

using namespace std;

long double total_per = 0;

// 서 북 동 남
int dx[] = {0,0,1,-1};
int dy[] = {1,-1,0,0};
double dir_per[4];

int n;
bool visited[100][100];

void dfs(int count, double per, int row, int col)
{
    if(count>=n)
    {
        // cout << per << '\n';
        total_per+=per;
        return;
    }
    
    for(int i=0; i<4; ++i)
    {
        int cur_r = row+dx[i];
        int cur_c = col+dy[i];
        if(visited[cur_r][cur_c] || dir_per[i]==0)
            continue;
        visited[cur_r][cur_c]=1;
        dfs(count+1, per*dir_per[i], row+dx[i], col+dy[i]);
        visited[cur_r][cur_c]=0;
    }

}

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(NULL); cout.tie(NULL);
    cin >> n;
    double per;
    for(int i=0; i<4; ++i)
    {
        cin >> per;
        dir_per[i] = per*0.01;
    }

    visited[50][50]=1;
    dfs(0,1.0,50,50);
    cout << setprecision(10) << total_per << '\n';
    // printf("%.10f\n", total_per);
}
```

