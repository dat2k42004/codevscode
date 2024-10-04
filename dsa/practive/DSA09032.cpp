#include <bits/stdc++.h>

using namespace std;
int n, m;
vector<vector<int>> v;
vector<int> vs;
int cnt;
void bfs(int s)
{
    queue<int> q;
    q.push(s);
    vs[s]=1;
    cnt++;
    while(q.size())
    {
        int u=q.front();
        q.pop();
        for(int x: v[u])
        {
            if(vs[x]==0)
            {
                vs[x]=1;
                q.push(x);
                cnt++;
            }
        }
    }
}
void solve()
{
    cin>>n>>m;
    v.clear();
    v.resize(n+1);
    for(int i=0; i<m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    int res=0;
    vs.clear();
    vs.resize(n+1, 0);
    for(int i=1; i<=n; ++i)
    {
        if(!vs[i])
        {
            cnt=0;
            bfs(i);
            res=max(cnt, res);
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