```cpp
#include<cstdlib>
#include<cstdio>
#include<iostream>
#include<vector>
#include<math.h>
using namespace std;

int main()
{
    long long n;
    scanf("%lld", &n);

    vector<long long> testers_in_class;
    testers_in_class.reserve(n);

    // vector<int> directors_in_class;
    // directors_in_class.reserve(n);

    long long input, main, sub;
    
    while(n--)
    {
        scanf("%lld", &input);
        // cin >> input;
        testers_in_class.push_back(input);
    }

    // printf("Here1");
    // cin >> main >> sub;
    // printf("Here2");
    scanf("%lld",&main);
    scanf("%lld",&sub);
    
    int i;
    long long testers;
    long long num_of_director=0;

    for(i=0;i<testers_in_class.size();++i)
    {
        testers=testers_in_class[i];
        testers-=main;
        num_of_director++;

        if(testers<=0) continue;

        if(testers%sub==0)
            num_of_director+=(testers/sub);
        else    
            num_of_director+=(testers/sub)+1;
        // num_of_director += ceil((double)testers/(double)sub);
        // printf("%d  ", num_of_director);
    }
    printf("%lld", num_of_director);

    return 0;
}
```