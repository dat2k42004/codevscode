#include <iostream>
#include <vector>
#include <queue>

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
        for(int i : v[u])
        {
            if(vs[i]==0)
            {
                vs[i]=1;
                q.push(i);
            }
        }
    }
}
void solve()
{
    int n, m;
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
    int q;
    cin>>q;
    while(q--)
    {
        int x, y;
        cin>>x>>y;
        vs.clear();
        vs.resize(n+1);
        bfs(x);
        if(vs[y]==0) cout<<"NO";
        else cout<<"YES";
        cout<<endl;
    }
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