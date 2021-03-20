# A → B 

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞은 사람 | 정답 비율 |
| :-------- | :---------- | :--- | :--- | :-------- | :-------- |
| 2 초      | 512 MB      | 5181 | 2276 | 1810      | 42.429%   |

## 문제

정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.

- 2를 곱한다.
- 1을 수의 가장 오른쪽에 추가한다. 

A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.



## 입력

첫째 줄에 A, B (1 ≤ A < B ≤ 109)가 주어진다.



## 출력

A를 B로 바꾸는데 필요한 연산의 최솟값에 1을 더한 값을 출력한다. 만들 수 없는 경우에는 -1을 출력한다.



## 예제 입력 1

```
2 162
```

## 예제 출력 1

```
5
```

2 → 4 → 8 → 81 → 162



## 예제 입력 2

```
4 42
```

## 예제 출력 2

```
-1
```



## 예제 입력 3

```
100 40021
```

## 예제 출력 3

```
5
```

100 → 200 → 2001 → 4002 → 40021



### 풀이

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
    if(a_==b) 
    {
        return count;
    }
    if(a_>b) 
    {   
        return MAX;
    }
    return min(solve(count+1, a_*2), solve(count+1, a_*10+1));
}


int main()
{

    cin >> a >> b;

    int i,j;

    int answer = solve(0,a);

    if(answer==MAX) cout <<-1;
    else cout << answer+1;

}
```

