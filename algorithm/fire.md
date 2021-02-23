# 불! 

| 시간 제한 | 메모리 제한 | 제출  | 정답 | 맞은 사람 | 정답 비율 |
| :-------- | :---------- | :---- | :--- | :-------- | :-------- |
| 1 초      | 256 MB      | 11693 | 2783 | 1940      | 22.291%   |



## 문제

지훈이는 미로에서 일을 한다. 지훈이를 미로에서 탈출하도록 도와주자!

미로에서의 지훈이의 위치와 불이 붙은 위치를 감안해서 지훈이가 불에 타기전에 탈출할 수 있는지의 여부, 그리고 얼마나 빨리 탈출할 수 있는지를 결정해야한다.

지훈이와 불은 매 분마다 한칸씩 수평또는 수직으로(비스듬하게 이동하지 않는다) 이동한다. 

불은 각 지점에서 네 방향으로 확산된다. 

지훈이는 미로의 가장자리에 접한 공간에서 탈출할 수 있다. 

지훈이와 불은 벽이 있는 공간은 통과하지 못한다.



## 입력

입력의 첫째 줄에는 공백으로 구분된 두 정수 R과 C가 주어진다. 단, 1 ≤ R, C ≤ 1000 이다. R은 미로 행의 개수, C는 열의 개수이다.

다음 입력으로 R줄동안 각각의 미로 행이 주어진다.

 각각의 문자들은 다음을 뜻한다.

- \#: 벽
- .: 지나갈 수 있는 공간
- J: 지훈이의 미로에서의 초기위치 (지나갈 수 있는 공간)
- F: 불이 난 공간

J는 입력에서 하나만 주어진다.



## 출력

지훈이가 불이 도달하기 전에 미로를 탈출 할 수 없는 경우 IMPOSSIBLE 을 출력한다.

지훈이가 미로를 탈출할 수 있는 경우에는 가장 빠른 탈출시간을 출력한다. 



## 예제 입력 1 

```
4 4
####
#JF#
#..#
#..#
```



## 예제 출력 1

```
3
```



```cpp
#include <iostream>
#include <vector>
#include <string>
#include <cstdlib>
#include <queue>

using namespace std;

int dx[] = {0,0,-1,1};
int dy[] = {-1,1,0,0};
int n, m;
char matrix[1001][1001];

queue<pair<int, int> > jPlace;
queue<pair<int, int> > fPlace;

bool jv[1001][1001];
bool fv[1001][1001];


bool escape = false;

void prtArr()
{
    cout << "=================" << '\n';
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            cout << matrix[i][j];
        }
        cout << '\n';
    }
}

void fbfs()
{
    int sz = fPlace.size();

    while(sz--)
    {
        int row = fPlace.front().first;
        int col = fPlace.front().second;
        fPlace.pop();

        for(int i=0; i<4; ++i)
        {
            int cur_r = row+dx[i];
            int cur_c = col+dy[i];

            if(cur_r>-1 && cur_r<n && cur_c>-1 && cur_c<m)
            {
                if(fv[cur_r][cur_c]) continue;
                if(matrix[cur_r][cur_c]=='.')
                {
                    matrix[cur_r][cur_c] = 'F';
                    fPlace.push({cur_r,cur_c});
                    fv[cur_r][cur_c]=1;
                }
            }
        }
    }    
}

void jbfs()
{
    int sz = jPlace.size();

    while(sz--)
    {
        int row = jPlace.front().first;
        int col = jPlace.front().second;
        jPlace.pop();

        for(int i=0; i<4; ++i)
        {
            int cur_r = row+dx[i];
            int cur_c = col+dy[i];

            //탈출성공
            if(cur_r<0 || cur_r>=n || cur_c<0 || cur_c>=m)
            {
                escape=1;
                return;
            }
            
            if(jv[cur_r][cur_c]) continue;

            if(matrix[cur_r][cur_c]=='.')
            {
                jv[cur_r][cur_c]=1;
                jPlace.push({cur_r,cur_c});
            } 
        }
    }
}

int main()
{
    ios_base :: sync_with_stdio(0);
    cin.tie(NULL); cout.tie(NULL);



    cin >> n >> m;

    char input;
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            cin >> input;
            if(input== 'J') 
            {
                jPlace.push({i,j});
                jv[i][j]=1;
            }
            if(input== 'F') 
            {
                fPlace.push({i,j}); 
                fv[i][j]=1;
            }
            matrix[i][j] = input;
        }
    }

    int count=0;
    while(!jPlace.empty() && !escape)
    {
        // prtArr();
        fbfs();
        jbfs();
        count++;
    }
    if(escape==false) cout << "IMPOSSIBLE";
    else cout << count;
}
```

