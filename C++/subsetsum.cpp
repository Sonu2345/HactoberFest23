#include<iostream>
using namespace std;
 
bool subset_sum(int a[],int n, int sum)
{
    //boolean matrix to store results
    bool dp[n+1][sum+1];
 
    //dp[i][j]=whethere there is a subset of sum j in subarray a[0....i-1]
 
    int i,j;
 
    //initialization
    //for sum=0, there is always a subset possible ie., the empty set
    for(i=0;i<=n;i++)
        dp[i][0]=true;
 
    //if there are no elements in the array, no subset is possible for a non-zero sum
    for(j=1;j<=sum;j++)
        dp[0][j]=false;
 
    //i represents the no. of elements of array considered
    for(i=1;i<=n;i++)
    {
        //j represents the sum of subset being searched for
        for(j=1;j<=sum;j++)
        {
            //if using i-1 elements, there is a subset of desired sum
            //no need to search further
            //the result is true 
            if(dp[i-1][j]==true)
                dp[i][j]=true;
 
            //otherwise, we will inspect
            else
            {
                //if value of current element is greater than the required sum
                //this element cannot be considered
                if(a[i-1]>j)
                    dp[i][j]=false;
 
                //check that after including this element, Is there any subset present for the remaining sum ie., j-a[i-1]
                else
                    dp[i][j]=dp[i-1][j-a[i-1]];
            }
        }
    }
 
    //return the overall result
    return dp[n][sum];
}
 
int main()
{
    int i;
    int n;
    int sum;
 
    cout<<"Enter the value of sum"<<endl;
    cin>>sum;
 
    cout<<"Enter the number of elements in the set"<<endl;
    cin>>n;
    int a[n];
 
    cout<<"Enter the values"<<endl;
    for(i=0;i<n;i++)
        cin>>a[i];
 
    bool result=subset_sum(a,n,sum);
 
    if(result==true)
        cout<<"subset with the given sum found";
 
    else
        cout<<"no required subset found";
 
    cout<<endl; 
    return 0;
}
