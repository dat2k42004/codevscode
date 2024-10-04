#include <bits/stdc++.h>
#define ll long long
using namespace std;
ll mod=1e9+7;
void solve()
{
    int n;
    cin>>n;
    priority_queue<ll, vector<ll>, greater<ll>> q;
    for(int i=0; i<n; ++i)
    {
        ll x;
        cin>>x;
        q.push(x);
    }
    ll sum=0;
    while(q.size()>1)
    {
        ll x=q.top();
        q.pop();
        ll y=q.top();
        q.pop();
        sum+=(x%mod+y%mod)%mod;
        sum%=mod;
        q.push((x%mod+y%mod)%mod);
    }
    cout<<sum<<endl;
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