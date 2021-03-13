```cpp
#include <iostream>
#include <cstdlib>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	int N;
	
	cin >> N;
	
	vector<int> v(N);
	
	int i;
	for(i=0; i<N; ++i)
	{
		cin >> v[i];
	} 		
	
	sort(v.begin(), v.end(), greater<int>());

	for(i=0; i<N; ++i)
	{
		cout <<v[i] << '\n';
	}

}
```
