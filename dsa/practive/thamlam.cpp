#include <iostream>
#include <vector> 

using namespace std;

// bài toan doi tien
void greedy(int value, int coins[], int ans[], int n)
{
    for(int i=n-1; i>=0; --i)
    {
        ans[i]=0;
        while(coins[i]<=value)
        {
            value-=coins[i];
            ans[i]++;
        }
    }
}

int main()
{
    int n, value;
    int c[n], a[n];
    cin>>n>>value;
    for(int i=0; i<n; ++i) cin>>c[i];
    greedy(n, c, a, value);
    int sum=0;
    for(int i=0; i<n; ++i)
    {
        sum+=a[i];
    }
    cout<<sum;
    system("pause");
    return 0;
}