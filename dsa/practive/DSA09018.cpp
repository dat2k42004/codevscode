#include <bits/stdc++.h>

using namespace std;
int n, m;
vector<vector<int>> v;
int vs[1001];
void bfs(int i)
{
    queue<int> q;
    q.push(i);
    vs[i]=1;
    while(q.size())
    {
        int x=q.front();
        q.pop();
        for(int u: v[x])
        {
            if(vs[u]==0)
            {
                vs[u]=1;
                q.push(u);
            }
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
    for(int i=1; i<=n; ++i) vs[i]=0;
    int res=0;
    for(int i=1; i<=n; ++i)
    {
        if(vs[i]==0) 
        {
            res++;
            bfs(i);
        }
    }
    for(int i=1; i<n; ++i)
    {
        for(int j=1; j<=n; ++j) vs[j]=0;
        vs[i]=1;
        int cnt=0;
        for(int j=1; j<=n; ++j)
        {
            if(vs[j]==0)
            {
                cnt++;
                bfs(j);
            }
        }
        if(cnt>res) cout<<i<<' ';
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