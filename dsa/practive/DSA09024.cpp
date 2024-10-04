#include <iostream>
#include <queue>
#include <vector>

using namespace std;
vector<vector<int>> v;
vector<int> vs;
void bfs(int x)
{
    queue<int> q;
    q.push(x);
    vs[x]=1;
    while(!q.empty())
    {
        int u=q.front();
        q.pop();
        cout<<u<<' ';
        for(int i: v[u])
        {
            if(vs[i]==0)
            {
                q.push(i);
                vs[i]=1;
            }
        }
    }
}
void solve()
{
    int n, m, k;
    cin>>n>>m>>k;
    v.clear();
    v.resize(n+1);
    for(int i=1; i<=m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x].push_back(y);
    }
    vs.clear();
    vs.resize(n+1, 0);
    bfs(k);
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