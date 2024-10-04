#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

const long long mod=1e9+7;

long long exponential(long long n, long long k)
{
    if(k==1) return n;
    long long half=exponential(n, k/2);
    if(k%2==0)
    {
        return (half*half)%mod;
    }
    else
    {
       return (((half*half)%mod)*n)%mod;
    }
}

void solve()
{
    long long n, k;
    cin>>n>>k;
    cout<<exponential(n, k)<<endl;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    system("pause");
    return 0;
}
