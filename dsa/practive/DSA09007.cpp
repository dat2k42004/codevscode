#include <iostream>
#include <queue>
#include <algorithm>
#include <vector>

using namespace std;
int n, m;
int v[1001][1001];
vector<int> vs, e;

void bfs(int x)
{
    queue<int> q;
    q.push(x);
    while(!q.empty())
    {
        int u=q.front();
        int ok=0;
        vs[u]=1;
        for(int i=1; i<=n; ++i)
        {
            if(vs[i]==0 && v[u][i]==1)
            {
                vs[i]=1;
                ok=1;
                q.push(i);
                e[i]=u;
            }
        }
        if(ok==0) q.pop();
    }
}
void solve()
{
    int x, y;
    cin>>n>>m>>x>>y;
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
    e.clear();
    vs.resize(n+1);
    e.resize(n+1);
    bfs(x);
    if(vs[y]==0) cout<<-1;
    else
    {
        vector<int> kq;
        int t=y;
        while(t!=x)
        {
            kq.push_back(t);
            t=e[t];
        }
        kq.push_back(t);
        for(int i=kq.size()-1; i>=0; --i) cout<<kq[i]<<' ';
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
    system("pause");
    return 0;
}