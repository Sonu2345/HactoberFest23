#include <bits/stdc++.h>

using namespace std;

int print_subsequences(int a[], int i, int n, int j, int sum){
    if(j > sum) return 0;
    if(i==n){
        if(j == sum){
            return 1;
        }
        return 0;
    }
    int c = print_subsequences(a, i+1, n, j+a[i], sum);

    int b = print_subsequences(a, i+1, n, j, sum);
    
    return c+b;
}

int main()
{
    int a[5] = {1, 2, 3, 4, 5};
    int n = 5;
    int sum = 5;
    cout << print_subsequences(a, 0, n, 0, sum);

    return 0;
}
