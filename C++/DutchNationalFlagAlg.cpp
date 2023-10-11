// Dutch National Flag Algo also known as Sort 012

#include <iostream>
using namespace std;

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

void sort012(int arr[], int n)
{
    int left = 0;
    int mid = 0;
    int right = n - 1;

    while (mid <= right)
    {
        if (arr[mid] == 0)
        {
            swap(arr[left], arr[mid]);
            left++;
            mid++;
        }
        else if (arr[mid] == 1)
        {
            mid++;
        }
        else
        {
            swap(arr[mid], arr[right]);
            right--;
        }
    }
}

int main()
{
    int arr[] = {0, 1, 2, 0, 2, 1, 0};
    int n = sizeof(arr) / sizeof(arr[0]);

    sort012(arr, n);
    printArray(arr, n);

    return 0;
}