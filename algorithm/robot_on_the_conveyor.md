```cpp
#include <iostream>
#include <queue>
 
#define MAX 220
#define endl "\n"
using namespace std;
 
int N, K, Start, End, Cnt, Answer;
int Belt[MAX];
bool Visit[MAX];
queue<int> Robot;
 
void Input()
{
    cin >> N >> K;
    for (int i = 1; i <= 2 * N; i++) cin >> Belt[i];
    
}
 
void Move_Belt()
{
    Start--;
    End--;
    if (Start < 1) Start = 2 * N;
    if (End < 1) End = 2 * N;
}
 
void Move_Robot()
{
    int Size = Robot.size();
    for (int i = 0; i < Size; i++)
    {
        int Cur = Robot.front();
        Visit[Cur] = false;
        Robot.pop();
        
        if (Cur == End) continue;
 
        int Next = Cur + 1;
        if (Next > 2 * N) Next = 1;
        if (Belt[Next] >= 1 && Visit[Next] == false)
        {
            Belt[Next]--;
            if (Belt[Next] == 0) Cnt++;
            if (Next == End) continue;
            Visit[Next] = true;
            Robot.push(Next);
 
        }
        else
        {
            Visit[Cur] = true;
            Robot.push(Cur);
        }
    }
}
 
void Make_Robot()
{
    if (Visit[Start] == false && Belt[Start] >= 1)
    {
        Visit[Start] = true;
        Belt[Start]--;
        Robot.push(Start);
 
        if (Belt[Start] == 0) Cnt++;
    }
}
 
void Solution()
{
    Start = 1;
    End = N;
 
    while (Cnt < K)
    {
        Answer++;
 
        Move_Belt();
        Move_Robot();
        Make_Robot();
    }
    cout << Answer << endl;
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

