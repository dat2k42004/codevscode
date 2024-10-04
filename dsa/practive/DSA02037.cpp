#include <bits/stdc++.h>

using namespace std;
int n, a[100], sum;
int nt(int n)
{
    if(n<2) return 0;
    for(int i=2; i<=sqrt(n); ++i)
    {
        if(n%i==0) return 0;
    }
    return 1;
}
vector<int> v;
set<vector<int>> s;
void next(int i)
{
    for(int j=i; j<=n; ++j)
    {
        sum+=a[j];
        v.push_back(a[j]);
        if(nt(sum))
        {
            vector<int> res(v.rbegin(), v.rend());
            s.insert(res);
        }
        if(j+1<=n)  next(j+1);
        sum-=a[j];
        v.pop_back();
    }
}
void solve()
{
    cin>>n;
    for(int i=1; i<=n; ++i) cin>>a[i];
    sort(a+1, a+n+1);
    s.clear();
    v.clear();
    next(1);
    for(auto x: s)
    {
        for(int i=0; i<x.size(); ++i) cout<<x[i]<<' ';
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