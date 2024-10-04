#include <iostream>
#include <stack>
#include <algorithm>
#include <vector>

using namespace std;
int n, m;
int v[1001][1001]={0};
vector<int> vs, e;
void dfs(int x)
{
    stack<int> st;
    st.push(x);
    while(!st.empty())
    {
        int u=st.top();
        vs[u]=1;
        int ok=0;
        for(int i=1; i<=n; ++i)
        {
            if(vs[i]==0 && v[u][i]==1)
            {
                vs[i]=1;
                st.push(i);
                ok=1;
                e[i]=u;
                break;
            }
        }
        if(ok==0) st.pop();
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
    dfs(x);
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
        for(int i=kq.size()-1; i>=0; i--) cout<<kq[i]<<' ';
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