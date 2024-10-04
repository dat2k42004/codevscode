#include <bits/stdc++.h>

using namespace std;
int n, m;
vector<pair<int, int>> v[1001];
int d[1001];
void dijkstra(int s)
{
    for(int i=1; i<=n; ++i)
    {
        d[i]=INT_MAX;
    }
    d[s]=0;
    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> q;
    q.push({s, 0});
    while(q.size())
    {
        int u=q.top().first;
        q.pop();
        for(pair<int, int> x: v[u])
        {
            if(d[x.first]>d[u]+x.second)
            {
                d[x.first]=d[u]+x.second;
                q.push({x.first, d[x.first]});
            }
        }
    }
    for(int i=1; i<=n; ++i) cout<<d[i]<<' '; 
}
void solve()
{
    int s;
    cin>>n>>m>>s;
    for(int i=0; i<1001; ++i) v[i].clear();
    for(int i=1; i<=m; ++i)
    {
        int x, y, z;
        cin>>x>>y>>z;
        v[x].push_back({y, z});
        v[y].push_back({x, z});
    }
    dijkstra(s);
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