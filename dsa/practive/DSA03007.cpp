#include <bits/stdc++.h>
#define ll long long
using namespace std;
bool cmp(ll a, ll b)
{
    return a>b;
}
ll setup(vector<ll> a, vector<ll> b)
{
    sort(a.begin(), a.end());
    sort(b.begin(), b.end(), cmp);
    ll sum=0;
    for(int i=0; i<a.size(); ++i)
    {
        sum+=a[i]*b[i];
    }
    return sum;
}
void solve()
{
    int n;
    cin>>n;
    vector<ll> a(n), b(n);
    for(int i=0; i<n; ++i) cin>>a[i];
    for(int i=0; i<n; ++i) cin>>b[i];
    cout<<min(setup(a, b), setup(b, a))<<endl;
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