#include <bits/stdc++.h>
#define ll long long
using namespace std;
void solve()
{
    int k;
    cin>>k;
    string s;
    cin>>s;
    map<char, ll> m;
    for(int i=0; i<s.size(); ++i) m[s[i]]++;
    priority_queue<ll, vector<ll>, less<ll>> q;
    for(auto x: m)
    {
        q.push(x.second);
    }
    for(int i=1; i<=k; ++i)
    {
        ll x=q.top();
        q.pop();
        q.push(x-1);
    }
    ll sum=0;
    while(q.size())
    {
        sum+=q.top()*q.top();
        q.pop();
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