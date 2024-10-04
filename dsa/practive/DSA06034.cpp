#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#define ll long long
using namespace std;
void solve()
{
    ll n, k;
    cin>>n>>k;
    vector<ll> v(n);
    map<ll, ll> m;
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
        m[v[i]]++;
    }
    vector<pair<ll, ll>> v1;
    for(auto x: m)
    {
        v1.push_back({x.first, x.second});
    }
    sort(v1.begin(), v1.end());
    int l=0, r=v1.size()-1;
    ll cnt=0;
    while(l<r)
    {
        if(v1[l].first+v1[r].first==k)
        {
            cnt+=v1[l].second*v1[r].second;
            l++;
            r--;
        }
        else if(v1[l].first+v1[r].first>k) r--;
        else l++;
    }
    if(v1.size()%2==1 && 2*v1[v1.size()/2].first==k && v1[v1.size()/2].second>=2)
    {
        cnt+=v1[v1.size()/2].second*(v1[v1.size()/2].second-1)/2;
    }
    cout<<cnt<<endl;
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