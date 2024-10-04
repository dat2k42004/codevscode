#include <bits/stdc++.h>
#define ll long long 


using namespace std;
int n;
ll mod=1e9+7;
struct data
{
    ll x[10][10];
};
struct data operator* (struct data a, struct data b)
{
    struct data c;
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<n; ++j)
        {
            c.x[i][j]=0;
            for(int k=0; k<n; ++k)
            {
                c.x[i][j]=(c.x[i][j]+(a.x[i][k]*b.x[k][j])%mod)%mod;
            }
        }
    }
    return c;
}
struct data mul(struct data a, ll k)
{
    if(k==1) return a;
    if(k%2==1) return a*mul(a, k-1);
    struct data v=mul(a, k/2);
    return v*v;
}
void solve()
{
    ll k;
    cin>>n>>k;
    struct data a;
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<n; ++j) cin>>a.x[i][j];
    }
    a=mul(a, k);
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<n; ++j) cout<<a.x[i][j]<<' ';
        cout<<endl;
    }
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