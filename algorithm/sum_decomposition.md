```cpp
#include <iostream>
#include <vector>

using namespace std;

int N, K;
long long dp[201][201];

int main()
{

    cin >> N >> K;

    int i,j,k,l;

    for(i=0; i<=N; ++i)
    {
        dp[1][i] = 1;
    }

    for(i=1; i<=K; ++i)
    {
        for(j=0; j<=N; ++j)
        {
            for(l=0; l<=j; ++l)
            {
                dp[i][j] += dp[i-1][l] % 1000000000;
            }
        }
    }
    cout << dp[K][N]%1000000000;

}
```

