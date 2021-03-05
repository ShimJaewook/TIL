```cpp
#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

vector< vector<int> > house;
int end_row, end_col;
int count=0;
int endPoint;

vector< pair<int, int> > barriers;


// state 0 : 가로, state 1 : 대각선, stat 2 = 세로
void moving(int row, int col, int state)
{

    if(row>end_row || col>end_col) 
        return;
    for(pair<int, int> barrier : barriers)
    {
        if(row==barrier.first && col==barrier.second)
            return;
        // 대각선 이동 시 추가로 스치는 픽셀들에 장애물 검사
        if(state==1)
        {
            if(row-1==barrier.first && col==barrier.second) return;
            if(row==barrier.first && col-1==barrier.second) return;
        }
        
    }   

    if(row==end_row && col==end_col) 
    {
        count++;
        return;
    }
    
    if(state==0)
    {
        moving(row, col+1, 0);
        moving(row+1, col+1, 1);       
    } 

    if(state==1)
    {
        moving(row, col+1, 0);
        moving(row+1, col+1, 1);
        moving(row+1, col, 2);
    }

    if(state==2)
    {
        moving(row+1, col+1, 1);
        moving(row+1, col, 2);
    }

    return;
}


int main()
{
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    int n;

    cin >> n;

    end_row=n-1; end_col=n-1;

    vector<int> temp(n);
    
    int i, j, wall;

    for(i=0; i<n; ++i)
    {
        temp.clear();
        for(j=0;j<n;++j)
        {
            cin >> wall;
            if(wall==1)
            {
                pair<int,int> barrier;
                barrier.first=i;
                barrier.second=j;
                barriers.push_back(barrier);
            }
            temp.push_back(wall);
        }
        house.push_back(temp);
    }

    endPoint=house[i-1].back();
    
    // cout << barriers.size() << endl;
    // for(i=0; i<n; ++i)
    // {
    //     for(j=0;j<n;++j)
    //     {
    //         cout << house[i][j] << " ";
    //     }
    //     cout << endl;
    // }

    moving(0,1,0);

    cout << count;
    return 0;
}
```

