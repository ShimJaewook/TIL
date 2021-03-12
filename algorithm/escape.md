```cpp
#include <iostream>
#include <cstdlib>
#include <vector>
#include <queue>

using namespace std;

int row, col, count=0;
bool findS = false;
vector<vector<char> > map;
queue<pair<int, int> > overflow;
queue<pair<int, int> > goseumdochi;

void flooding()
{
    pair<int, int> wet;
    int overflow_count = overflow.size();
    int x,y;
    while (overflow_count--)
    {
        wet=overflow.front();
        x=wet.first;
        y=wet.second;
        if(x-1>=0 && (map[x-1][y]=='.' || map[x-1][y]=='S'))
        {
            map[x-1][y] = '*';
            overflow.push({x-1,y});
        }
        if(x+1<row && (map[x+1][y]=='.' || map[x+1][y]=='S'))
        {
            map[x+1][y] = '*';
            overflow.push({x+1,y});
        }
        if(y-1>=0 && (map[x][y-1]=='.' || map[x][y-1]=='S'))
        {
            map[x][y-1] = '*';
            overflow.push({x,y-1});
        }
        if(y+1<col && (map[x][y+1]=='.' || map[x][y+1]=='S'))
        {
            map[x][y+1] = '*';
            overflow.push({x,y+1});
        }
        overflow.pop();
    }
}

void bfs()
{
    pair<int, int> foot_work;
    int foot_work_count = goseumdochi.size();
    int x,y;
    while(foot_work_count--)
    {
        foot_work=goseumdochi.front();
        x=foot_work.first;
        y=foot_work.second;

        if(x-1>=0)
        {
            if(map[x-1][y]=='D')
            {
                findS=true;
                break;
            }
            if(map[x-1][y]=='.')    
            {
                goseumdochi.push({x-1,y});
                map[x-1][y]='S';
            }
        }

        if(x+1<row)
        {
            if(map[x+1][y]=='D')
            {
                findS=true;
                break;
            }
            if(map[x+1][y]=='.')    
            {
                goseumdochi.push({x+1,y});
                map[x+1][y]='S';
            }
        }
        
        if(y-1>=0)
        {
            if(map[x][y-1]=='D')
            {
                findS=true;
                break;
            }   
            if(map[x][y-1]=='.') 
            {
                goseumdochi.push({x,y-1});
                map[x][y-1]='S';
            }
        }

        if(y+1<col)
        {
            if(map[x][y+1]=='D')
            {
                findS=true;
                break;
            }
            if(map[x][y+1]=='.')
            {
                goseumdochi.push({x,y+1});
                map[x][y+1]='S';
            }    
        }
        goseumdochi.pop();
    }
}

int main()

{
    cin >> row >> col;
    
    int i, j;
    char pixel;

    for(i=0; i<row; ++i)
    {
        vector<char> temp;
        for(j=0; j<col; ++j)
        {
            cin >> pixel;
            if(pixel=='*') overflow.push({i,j}); 
            if(pixel=='S') goseumdochi.push({i,j});
            temp.push_back(pixel);
        }

        map.push_back(temp);
    }   

    while(findS==false)
    {
        flooding();

        bfs();        
        count++;
        if(goseumdochi.size()==0)
        {
            cout<<"KAKTUS";
            break;
        }
    }

    if(findS) cout << count;

    return 0;
}
```

