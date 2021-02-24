```cpp
#include <iostream>
#include <vector>
#include <math.h>
#define MAX 9999999
using namespace std;

bool can = false;
long long int a, b;

int solve(int count, long long int a_)
{
    // cout << a_ << '\n';
    if(a_==b) 
    {
        // cout << "TRUE" << '\n';
        return count;
    }
    if(a_>b) 
    {   
        // cout << "FALSE" << '\n';
        return MAX;
    }
    // cout << min(solve(count+1, a_*2), solve(count+1, a_*10+1)) << '\n';
    return min(solve(count+1, a_*2), solve(count+1, a_*10+1));
}


int main()
{

    cin >> a >> b;

    int i,j;

    int answer = solve(0,a);

    if(answer==MAX) cout <<-1;
    else cout << answer+1;

    // while(a<b)
    // {
        
    // }

    // for(i=0; i<a; ++i)
    // {
    //     for(j=0; j<b; ++j)
    //     {

    //     }
    // }
}
```

