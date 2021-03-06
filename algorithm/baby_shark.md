```cpp
#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

int N;
int matrix[21][21];
bool visit[21][21];
bool init[21][21];

int dx[] = {-1,0,0,1};
int dy[] = {0,-1,1,0};

typedef pair<int, int> place;


struct baby_shark {
    int lv=2;
    int exp=0;
    place p; 
};

baby_shark shark;

void prtV () {

    cout << "=======================V=======================\n";
    for(int i=0; i<N; ++i)
    {
        for(int j=0 ;j<N ; ++j)
        {
            cout << visit[i][j]; 
        }
        cout << '\n';
    }
}

void prtM () {
    cout << "=======================M=======================\n";
    for(int i=0; i<N; ++i)
    {
        for(int j=0 ;j<N ; ++j)
        {
            cout << matrix[i][j]; 
        }
        cout << '\n';
    }
}

void initV() {
    for(int i=0; i<N; ++i)
    {
        for(int j=0 ;j<N ; ++j)
        {
            visit[i][j] = 0; 
        }
    }
}

bool cmp(place a, place b) {
    if(a.first == b.first)
    {
        return a.second < b.second;
    }
    return a.first < b.first;
}

int find_food(place p) {

    queue<place> q;
    q.push(p);
    visit[p.first][p.second] = 1;
    matrix[p.first][p.second] = 0;
    int count =0;
    int sz;
    vector<place> v;
    while(!q.empty())
    {
        count++;
        sz = q.size();
        while(sz--)
        {
            place cur_p = q.front();
            q.pop();
            int far_x;
            int far_y;
            for(int i=0; i<4; ++i) 
            {
                far_x = cur_p.first + dx[i];
                far_y = cur_p.second + dy[i];

                // prtV();
                
                if(far_x>-1 && far_x<N && far_y>-1 && far_y<N)
                {
                    if(visit[far_x][far_y]==0)
                    {
                        if(matrix[far_x][far_y] == shark.lv || matrix[far_x][far_y] == 0)
                        {
                            visit[far_x][far_y] = 1;
                            q.push({far_x, far_y});
                        }
                        else if(matrix[far_x][far_y] < shark.lv)
                        {
                            visit[far_x][far_y] = 1;
                            v.push_back({far_x,far_y});
                        }
                        else
                        {
                            visit[far_x][far_y] = 1;
                        }
                        
                    }
                }
            }
        }
        if(v.size()>0)
        {
            sort(v.begin(), v.end(), cmp);
            matrix[v[0].first][v[0].second]=0;
            shark.p=v[0];
            return count;
        }
    }
    return -1;
}

int main()
{
    cin >> N;

    for(int i=0; i<N; ++i)
    {
        for(int j=0; j<N; ++j)
        {
            cin >> matrix[i][j];
            if(matrix[i][j]==9)
            {
                shark.p = {i,j};
            }
        }
    }

    int time = 0;
    int count;
    while (1)
    {
        initV();
        // cout << shark.p.first << ' ' << shark.p.second << ' ' << count << '\n';
        count = find_food(shark.p);
        // prtM();
        if(count == -1) break;
        time += count;
        shark.exp++;
        if(shark.exp == shark.lv) 
        {
            shark.lv++;
            // cout << "LEVEL UP: " <<shark.lv << '\n';
            shark.exp = 0;
        }
        // cout << "TIME:" << time << '\n';
    }

    cout << time;

    return 0;
}
```