- Problem Name : [Find all triplets with zero sum](https://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/)
- Platform : GFG

- Code:
```cpp


#include <bits/stdc++.h>
using namespace std;

// Prints all triplets in arr[] with 0 sum
void findTriplets(int arr[], int n)
{
	bool found = false;
	for (int i = 0; i < n - 2; i++) {
		for (int j = i + 1; j < n - 1; j++) {
			for (int k = j + 1; k < n; k++) {
				if (arr[i] + arr[j] + arr[k] == 0) {
					cout << arr[i] << " " << arr[j] << " "
						<< arr[k] << endl;
					found = true;
				}
			}
		}
	}

	// If no triplet with 0 sum found in array
	if (found == false)
		cout << " not exist " << endl;
}

// Driver code
int main()
{
	int arr[] = { 0, -1, 2, -3, 1 };
	int n = sizeof(arr) / sizeof(arr[0]);
	findTriplets(arr, n);
	return 0;
}

```
