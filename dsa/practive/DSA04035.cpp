#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>

#define ll long long 
using namespace std;
ll mod =1e9+7;

ll exponential(ll a, ll b)
{
    if(b==1) return a;
    ll half=exponential(a, b/2);
    if(b%2==0) return (half*half)%mod;
    else return (((half*half)%mod)*a)%mod;
}

void solve()
{
    ll a, b;
    while(1)
    {
        cin>>a>>b;
        if(a==0 && b==0) break;
        if(b==0) cout<<1;
        cout<<exponential(a, b);
        cout<<endl;
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}