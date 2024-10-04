#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int n, m;
    cin>>n>>m;
    vector<int> a(n), b(m);
    for(int i=0; i<n; ++i) cin>>a[i];
    for(int i=0; i<m; ++i) cin>>b[i];
    map<int, int> mp;
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            mp[i+j]+=a[i]*b[j];
        }
    }
    for(auto x: mp)
    {
        cout<<x.second<<' ';
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