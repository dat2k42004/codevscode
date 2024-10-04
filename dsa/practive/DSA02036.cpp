#include <bits/stdc++.h>

using namespace std;
bool cmp(int a, int b)
{
    return a>b;
}
int n;
int v[20];
vector<int> a;
set<vector<int>> s;
int sum=0;
void next(int i)
{
    for(int j=i; j<=n; ++j)
    {
        sum+=v[j];
        a.push_back(v[j]);
        if(sum%2==1)
        {
            vector<int> r(a.rbegin(), a.rend());
            s.insert(r);
        }
        if(j+1<=n) next(j+1);
        sum-=v[j];
        a.pop_back();
    }
}
void solve()
{
    cin>>n;
    for(int i=1; i<=n; ++i) cin>>v[i]; 
    sort(v+1, v+n+1);
    s.clear();
    a.clear();
    sum=0;
    next(1);
    for(auto x: s)
    {
        for(int i=0; i<x.size(); ++i) cout<<x[i]<<' ';
        cout<<endl;
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