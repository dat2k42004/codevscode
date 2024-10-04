#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
#include <cstring>
using namespace std;
int n, m, ok;
vector<int> v[1001];
int vs[1001], e[1001];
void dfs(int s)
{
    vs[s]=1;
    for(int x: v[s])
    {
        if(vs[x]==0)
        {
            e[x]=s;
            dfs(x);
        }
        else if(x!=e[s]) ok=1;
    }
}
void solve()
{
    cin>>n>>m;
    for(int i=0; i<=1000; ++i) v[i].clear();
    for(int i=1; i<=m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    ok=0;
    for(int i=1; i<=n; ++i)
    {
        memset(vs, 0, sizeof(vs));
        memset(e, 0, sizeof(e));
        dfs(i);
        if(ok==1) 
        {
            cout<<"NO";
            break;
        }
    }
    if(!ok) cout<<"YES";
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