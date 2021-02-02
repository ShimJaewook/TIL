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
#include <iostream>
#include <cstdlib>
#include <string>
#include <vector>

using namespace std;

int answer =0;
string input;

bool ck_lucky(string s)
{
    char last;
    for(char cur: s )
    {
        if(last==cur) return false;
        last = cur;
    }
    return true;
}

int main()
{
    ios_base :: sync_with_stdio(NULL);
    cin.tie(NULL); cout.tie(NULL);

    cin >> input;

    string next_str = input;

    do{
        next_permutation(next_str.begin(),next_str.end());
        answer+=ck_lucky(next_str);
    }while(next_str!=input);

    cout << answer;
}
```

