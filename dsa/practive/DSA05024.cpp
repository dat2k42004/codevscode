#include <bits/stdc++.h>
#define ll long long
using namespace std;
ll mod= 1e9+7;
void solve()
{
    int n, k;
    cin>>n>>k;
    int a[n];
    for(int i=0; i<n; ++i) cin>>a[i];
    ll v[k+1]={0};
    v[0]=1;
    for(int i=1; i<=k; ++i)
    {
        for(int j=0; j<n; ++j)
        {
            if(i>=a[j])
            {
                v[i]=(v[i]+v[i-a[j]])%mod;
            }
        }
    }
    cout<<v[k]<<endl;
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
