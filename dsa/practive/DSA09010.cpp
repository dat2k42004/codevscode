#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>

using namespace std;
int n, m;
vector<vector<int>> v;
vector<int> vs;
int cnt=0;
void bfs(int x)
{
    queue<int> q;
    q.push(x);
    cnt=1;
    vs[x]=1;
    while(q.size())
    {
        int u=q.front();
        q.pop();
        for(int i:v[u])
        {
            if(vs[i]==0)
            {
                cnt++;
                q.push(i);
                vs[i]=1;
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
        //v[y].push_back(x);
    }
    int ok=1;
    for(int i=1; i<=n; ++i)
    {
        vs.clear();
        vs.resize(n+1);
        bfs(i);
        if(cnt!=n)
        {
            cout<<"NO";
            ok=0;
            break;
        }
    }
    if(ok==1) cout<<"YES";
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