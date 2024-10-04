#include <iostream>
#include <queue>
#include <algorithm>
#include <vector>
using namespace std;
int n, m;
int v[1001][1001];
vector<int> vs;
void bfs(int x)
{
    queue<int> q;
    q.push(x);
    while(q.size())
    {
        int u=q.front();
        vs[u]=1;
        int ok=0;
        for(int i=1; i<=n; ++i)
        {
            if(vs[i]==0 && v[u][i]==1)
            {
                vs[i]=1;
                ok=1;
                q.push(i);
            }
        }
        if(ok==0) q.pop();
    }
}
void solve()
{
    cin>>n>>m;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=n; ++j) v[i][j]=0;
    }
    for(int i=1; i<=m; ++i)
    {
        int a, b;
        cin>>a>>b;
        v[a][b]=v[b][a]=1;
    }
    vs.clear();
    vs.resize(n+1);
    int cnt=0;
    for(int i=1; i<=n; ++i)
    {
        if(vs[i]==0)
        {
            cnt++;
            bfs(i);
        }
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
    return 0;
}