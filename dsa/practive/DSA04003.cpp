#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;
const long long mod=123456789;
long long exponential(long long a, long long b)
{
    if(b==1) return a%mod;
    long long half=exponential(a, b/2);
    if(b%2==0) return (half*half)%mod;
    else return (((half*half)%mod)*a)%mod;
}
void solve()
{
    long long n;
    cin>>n;
    cout<<exponential(2, n-1)<<endl;
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