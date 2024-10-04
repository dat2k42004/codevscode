#include <bits/stdc++.h>

using namespace std;
int n, m, k;
vector<vector<int>> v;
vector<pair<int, int>> a;
vector<int> vs;
void chance()
{
    for(int i=1; i<=n; ++i)
    {
        int res=0;
        for(int j=1; j<=n; ++j)
        {
            if(v[i][j]==1) res++;
        }
        a.push_back({res, i});
    }
}
bool cmp(pair<int, int> x, pair<int, int> y)
{
    return x.first>y.first;
}
void solve()
{
    cin>>n>>m>>k;
    v.clear();
    v.resize(n+1, vector<int>(n+1, 0));
    a.clear();
    vs.clear();
    vs.resize(n+1, 0);
    for(int i=1; i<=m; ++i) 
    {
        int x, y;
        cin>>x>>y;
        v[x][y]=v[y][x]=1;
    }
    chance();
    sort(a.begin(), a.end(), cmp);
    int cnt=0;
    for(auto i: a)
    {
        //cout<<i.first<<' '<<i.second<<endl;
        int u=i.second;
        if(vs[u]==0) cnt++;
        if(vs[u]) continue;
        vs[u]=1;
        for(int j=1; j<=n; ++j)
        {
            if(vs[j]==0 && v[u][j]==0)
            {
                vs[j]=1;
            }
        }
    }
    if(cnt<=k) cout<<"YES";
    else cout<<"NO";
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