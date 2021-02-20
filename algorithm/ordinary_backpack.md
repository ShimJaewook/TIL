# 평범한 배낭 성공



| 시간 제한 | 메모리 제한 | 제출  | 정답  | 맞은 사람 | 정답 비율 |
| :-------- | :---------- | :---- | :---- | :-------- | :-------- |
| 2 초      | 512 MB      | 27030 | 10224 | 6766      | 36.128%   |



## 문제

이 문제는 아주 평범한 배낭에 관한 문제이다.

한 달 후면 국가의 부름을 받게 되는 준서는 여행을 가려고 한다. 세상과의 단절을 슬퍼하며 최대한 즐기기 위한 여행이기 때문에, 가지고 다닐 배낭 또한 최대한 가치 있게 싸려고 한다.

준서가 여행에 필요하다고 생각하는 N개의 물건이 있다. 각 물건은 무게 W와 가치 V를 가지는데, 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다. 아직 행군을 해본 적이 없는 준서는 최대 K만큼의 무게만을 넣을 수 있는 배낭만 들고 다닐 수 있다. 준서가 최대한 즐거운 여행을 하기 위해 배낭에 넣을 수 있는 물건들의 가치의 최댓값을 알려주자.



## 입력

첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다. 두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.

입력으로 주어지는 모든 수는 정수이다.



## 출력

한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.



## 예제 입력 1 

```
4 7
6 13
4 8
3 6
5 12
```

## 예제 출력 1

```
14
```



### 풀이 

```cpp
#include <iostream>
#include <cstdlib>
#include <vector>
#include <math.h>

using namespace std;

//
int dp[101][1000001];

vector< vector<int> > wv;
int n, k;

int push_bag(int item_index, int weight)
{
    //dp에 이미 값이 들어 있을 경우 계산을 다시 하지 않는다.
    if(dp[item_index][weight]>0) return dp[item_index][weight];
    //아이템이 가방안에 다 들어가는 경우 종료.
    if(item_index==n) return 0;
    //무게가 초과 될거 같으면 안고르고 넘어감
    if(weight+wv[item_index][0]>k) return dp[item_index][weight] = push_bag(item_index+1, weight);
    //고르냐 안고르냐 중 더 큰 값을 dp에 넣고 리턴.
    return dp[item_index][weight] 
    = max(push_bag(item_index+1,weight), wv[item_index][1]+push_bag(item_index+1, weight+wv[item_index][0])); 
}

int main()
{
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    // while(1)
    // {
  
    cin >> n >> k ;

    vector<int> temp(2);
    int w, v, i;

    for(i=0; i<n; ++i)
    {   
        temp.clear();
        cin >> w >> v;
        temp.push_back(w);
        temp.push_back(v);
        wv.push_back(temp);
    }

    int answer = push_bag(0,0);

    printf("%d", answer);

}
```

