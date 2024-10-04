#include <bits/stdc++.h>
#define ll long long
using namespace std;
int mod=1e9+7;
ll f[2][2], m[2][2];
void mul(ll f[2][2], ll m[2][2])
{
    ll x=(f[0][0]*m[0][0]%mod + f[0][1]*m[1][0]%mod)%mod;
    ll y=(f[0][0]*m[0][1]%mod + f[0][1]*m[1][1]%mod)%mod;
    ll z=(f[1][0]*m[0][0]%mod + f[1][1]*m[1][0]%mod)%mod;
    ll t=(f[1][0]*m[0][1]%mod + f[1][1]*m[1][1]%mod)%mod;
    f[0][0]=x;
    f[0][1]=y;
    f[1][0]=z;
    f[1][1]=t;
}
void Pow(ll f[2][2], ll n)
{
    if(n<=1) return;
    Pow(f, n/2);
    mul(f, f);
    if(n&1) mul(f, m);
}
void solve()
{
    int n;
    cin>>n;
    f[0][0]=f[1][0]=f[0][1]=m[0][0]=m[0][1]=m[1][0]=1;
    f[1][1]=m[1][1]=0;
    if(n==0) cout<<0;
    else
    {
        Pow(f, n-1);
        cout<<f[0][0];
    }
    cout<<endl;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    return 0;
}