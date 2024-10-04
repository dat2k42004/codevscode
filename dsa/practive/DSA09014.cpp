#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>
using namespace std;
int n, m;
vector<int> v[1001];
int vs[1001], e[1001];
void dfs(int s, int& ok)
{
    vs[s]=1;
    for(auto x: v[s])
    {
        if(vs[x]==0)
        {
            e[x]=s;
            dfs(x, ok);
        }
        else if(e[s]!=x) ok=1;
    }
}
void solve()
{
    cin>>n>>m;
    int x, y;
    for(int i=0; i<=1000; ++i) v[i].clear();
    for(int i=1; i<=m; ++i)
    {
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    int res=0;
    int ok=0;
    for(int i=1; i<=n; ++i)
    {
        memset(vs, 0, sizeof(vs));
        memset(e, 0, sizeof(e));
        dfs(i, ok);
        if(ok==1) res=1;
    }
    if(res==1) cout<<"YES";
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