```cpp
#include <iostream>
#include <cstdlib>
#include <vector>
#include <queue>

using namespace std;

int matrix [101][101];
int dx[] = {0, 0,-1,1};
int dy[]= {-1,1,0,0};
queue<pair<int, int> > q;
int n, m;

void reset()
{
    for(int i=0; i<n;++i)
    {
        for(int j=0; j<m; ++j)
        {
            if(matrix[i][j] != 1)
                matrix[i][j] = 0;
        }
    }
}

void bindArea(int row, int col, int numb) 
{
    q.push({row,col});

    while(!q.empty())
    {
        pair<int, int> cur_place = q.front();
        q.pop();
        int x = cur_place.first;
        int y = cur_place.second;
        for(int i=0; i<4; ++i)
        {
            if(x+dx[i]>-1 && x+dx[i]<n && y+dy[i]>-1 && y+dy[i]<m)
            {
                if(matrix[x+dx[i]][y+dy[i]]==0)
                {
                    q.push({x+dx[i],y+dy[i]});
                    matrix[x+dx[i]][y+dy[i]] = numb;
                }   
            }
        }
    }

    // cout << '\n';
    // for(int i=0; i<n; ++i)
    // {
    //     for(int j=0; j<m; ++j)
    //     {
    //         cout << matrix[i][j] << ' ';
    //     }
    //     cout << '\n';
    // }
}

int main()
{
    ios_base :: sync_with_stdio(0);
    cin.tie(NULL); cout.tie(NULL);

    cin >> n >> m;

    int input;
    int cz_count = 0;
    for(int i=0; i<n;++i)
    {
        for(int j=0; j<m; ++j)
        {
            cin >> input;
            if(input==1) cz_count++;
            matrix[i][j] = input;
        }
    }

    int hour=0;
    int i,j,k;
    int last_numb;

    while(cz_count)
    {   
        last_numb = cz_count;
        bindArea(0,0,-1);
        for(i=0; i<n; ++i)
        {
            for(j=0; j<m; ++j)
            {
                bool isEdge = false;
                if(matrix[i][j]==1)
                {
                    if(matrix[i+1][j]==-1) isEdge=true;
                    if(matrix[i-1][j]==-1) isEdge=true;
                    if(matrix[i][j+1]==-1) isEdge=true;
                    if(matrix[i][j-1]==-1) isEdge=true;
                }
                if(isEdge)
                {
                    matrix[i][j]=0;
                    cz_count--;
                } 
            }
        }

        reset();
        hour++;
    }
        
    cout << hour << '\n' << last_numb;
}
```

