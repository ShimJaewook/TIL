# 행운의 문자열 - 백준 1342

### 1. 문제

> 민식이와 준영이는 자기 방에서 문자열을 공부하고 있다. 민식이가 말하길 인접해 있는 모든 문자가 같지 않은 문자열을 행운의 문자열이라고 한다고 한다. 준영이는 문자열 S를 분석하기 시작했다. 준영이는 문자열 S에 나오는 문자를 재배치하면 서로 다른 행운의 문자열이 몇 개 나오는지 궁금해졌다. 만약 원래 문자열 S도 행운의 문자열이라면 그것도 개수에 포함한다.

**입력**

> 첫째 줄에 문자열 S가 주어진다. S의 길이는 최대 10이고, 알파벳 소문자로만 이루어져 있다.

**출력**

> 첫째 줄에 위치를 재배치해서 얻은 서로 다른 행운의 문자열의 개수를 출력한다.





### 2. 풀이

---

```cpp
#include<iostream>
#include<vector>
 
#define endl "\n"
#define MAX 200
using namespace std;
 
int R, C, N;
int Boom_Time[MAX][MAX];
char MAP[MAX][MAX];
 
int dx[] = { 0, 0, 1, -1 };
int dy[] = { 1, -1, 0, 0 };
 
void Input()
{
    cin >> R >> C >> N;
    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            cin >> MAP[i][j];
            if (MAP[i][j] == 'O')
            {
                Boom_Time[i][j] = 3;
            }
        }
    }
}
 
void Install_Boom(int T)
{
    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            if (MAP[i][j] == 'O') continue;
            MAP[i][j] = 'O';
            Boom_Time[i][j] = T + 3;
        }
    }
}
 
void Delete_Boom(int T)
{
    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            if (Boom_Time[i][j] == T)
            {
                for (int k = 0; k < 4; k++)
                {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    
                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                    if (MAP[nx][ny] == '.') continue;
 
                    MAP[nx][ny] = '.';
                }
                MAP[i][j] = '.';
                Boom_Time[i][j] = 0;
            }
        }
    }
}
 
void Print()
{
    for (int i = 0; i < R; i++)
    {
        for (int j = 0; j < C; j++)
        {
            cout << MAP[i][j];
        }
        cout << endl;
    }
}
 
void Solution()
{
    int Time = 2;
    while (1)
    {
        if (Time == N + 1) break;
 
        if (Time % 2 == 0)
        {
            Install_Boom(Time);
        }
        else
        {
            Delete_Boom(Time);
        }
        Time++;
    }
    Print();
}
 
void Solve()
{
    Input();
    Solution();
}
 
int main(void)
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
 
    //freopen("Input.txt", "r", stdin);
    Solve();
 
    return 0;
}
```

