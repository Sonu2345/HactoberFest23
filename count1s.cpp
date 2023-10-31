#include <bits/stdc++.h>
using namespace std;

int count1s(int n) {
    int c = 0;
    while (n) {
        n &= (n-1); 
        c++;
    }
    
    return c;
}

int main(int argc, char const *argv[])
{
    cout << "Enter a number: ";
    int n;
    cin >> n;
    cout << "The number of 1's in it's binary representaion is/are: " << count1s(n) << endl;
    return 0;
}
