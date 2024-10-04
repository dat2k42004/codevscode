#include <bits/stdc++.h>

using namespace std;
int n, m, ok;
vector<vector<int>> v;
vector<int> vs, e;
void bfs(int i)
{
    vs[i]=1;
    for(int x: v[i])
    {
        if(vs[x]==0)
        {
            e[x]=i;
            bfs(x);
        }
        else if(x!=e[i])
        {
            ok=1;
            return;
        }
    }
}
void solve()
{
    cin>>n>>m;
    v.clear();
    v.resize(n+1);
    for(int i=1; i<=m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    ok=0;
    vs.clear();
    e.clear();
    vs.resize(n+1, 0);
    e.resize(n+1, -1);
    for(int i=1; i<=n; ++i)
    {
        if(vs[i]==0 && !ok) bfs(i);
    }
    if(ok==1) cout<<"YES";
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