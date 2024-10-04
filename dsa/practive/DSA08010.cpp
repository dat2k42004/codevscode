#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
#include <set>
#include <cmath>
#define ll long long
using namespace std;
void solve()
{
    ll n;
    cin>>n;
    queue<pair<ll, ll>> q;
    set<ll> s;
    pair<ll, ll> p;
    q.push({n, 0});
    s.insert(n);
    ll res=1e9;
    while(q.size())
    {
        p=q.front();
        q.pop();
        if(p.first==1)
        {
            res=min(res, p.second);
            break;
        }
        ll k=p.first;
        for(ll i=sqrt(k); i>=2; --i)
        {
            if(k%i==0 && s.count(k/i)==0)
            {
                s.insert(k/i);
                q.push({k/i, p.second+1});
            }
        }
        if(s.count(k-1)==0) 
        {
            s.insert(k-1);
            q.push({k-1, p.second+1});
        }
    }
    cout<<res<<endl;
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