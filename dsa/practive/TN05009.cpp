#include <bits/stdc++.h>

using namespace std;
int n, m, ok;
vector<int> v[1001];
int vs[1001], e[1001];
void dfs(int s)
{
    stack<int> q;
    q.push(s);
    vs[s]=1;
    while(q.size())
    {
        int u=q.top();
        q.pop();
        for(int x: v[u])
        {
            if(x==s && e[u]!=s)
            {
                ok=u;
                break;
            }
            if(vs[x]==0)
            {
                e[x]=u;
                vs[x]=1;
                q.push(u);
                q.push(x);
                break;
            }
        }
        if(ok) break;
    }
}
void solve()
{
    cin>>n>>m;
    for(int i=0; i<=1000; ++i) v[i].clear();
    for(int i=0; i<m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    for(int i=1; i<=n; ++i)
    {
        sort(v[i].begin(), v[i].end());
    }
    memset(vs, 0, sizeof(vs));
    memset(e, 0, sizeof(e));
    ok=0;
    dfs(1);
    if(!ok) cout<<"NO";
    else
    {
        vector<int> kq;
        while(e[ok])
        {
            kq.push_back(ok);
            ok=e[ok];
        }
        cout<<1<<' ';
        for(int i=kq.size()-1; i>=0; --i) cout<<kq[i]<<" ";
        cout<<1;
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
    return 0;
}