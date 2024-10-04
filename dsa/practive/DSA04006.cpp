#include <bits/stdc++.h>
#define ll long long
using namespace std;
ll count(ll pos, ll n, ll ctr)
{
    if(pos==1) return 1;
    else if(pos==ctr) return n%2;
    if(pos>ctr) return count(pos-ctr, n/2, ctr/2);
    else return count(pos, n/2, ctr/2);
}
void solve()
{
    ll n, l, r;
    cin>>n>>l>>r;
    ll res=pow(2, (ll)log2(n));
    ll ans=0;
    for(int i=l; i<=r; ++i)
    {
        ans+=count(i, n, res);
    }
    cout<<ans<<endl;
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