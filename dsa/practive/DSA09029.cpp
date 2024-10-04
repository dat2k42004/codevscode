#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
int n, m, ok;
vector<int> v[100];
vector<int> vs;
void dfs(int s, int k)
{
    for(int x: v[s])
    {
        if(k==n) 
        {
            ok=1;
            return;
        }
        if(vs[x]==0)
        {
            vs[x]=1;
            dfs(x, k+1);
            vs[x]=0;
        }
    }
}
void solve()
{
    cin>>n>>m;
    for(int i=0; i<100; ++i) v[i].clear();
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
        vs.clear();
        vs.resize(n+1, 0);
        vs[i]=1;
        dfs(i, 1);
        if(ok==1)
        {
            cout<<1;
            break;
        }
    }
    if(!ok) cout<<0;
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