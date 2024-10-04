#include <bits/stdc++.h>

using namespace std;
int n, k, fopt=0;
vector<int> v(n+1), c(n+1), a(n+1), x;
void result()
{
    int res=0, tmp=0;
    for(int i=1; i<=n; ++i)
    {
        if(v[i]==1) res+=a[i], tmp+=c[i];
    }
    if(res<=k && tmp>fopt)
    {
        x.clear();
        fopt=tmp;
        for(int i=1; i<=n; ++i)
        {
            x.push_back(v[i]);
        }
    }
}
void tri(int i)
{
    for(int j=0; j<=1; ++j)
    {
        v[i]=j;
        if(i==n) result();
        else tri(i+1);
    }
}
void solve()
{
    cin>>n>>k;
    for(int i=1; i<=n; ++i) cin>>c[i];
    for(int i=1; i<=n; ++i) cin>>a[i];
    tri(1);
    cout<<fopt<<endl;
    for(int i=0; i<x.size(); ++i) cout<<x[i]<<' ';
}
int main()
{
    solve();
    system("pause");
    return 0;
}