#include <bits/stdc++.h>

using namespace std;
vector<int> v[1001];
int vs[1001];
int n, m;
void dfs(int s, int &ok)
{
    stack<int> st;
    st.push(s);
    vs[s]=1;
    while(st.size())
    {
        int u=st.top();
        st.pop();
        for(int x: v[u])
        {
            if(vs[x]==0)
            {
                st.push(u);
                st.push(x);
                vs[x]=1;
                break;
            }
            else if(x==s) ok=1;
        }
    }
}
void solve()
{
    cin>>n>>m;
    for(int i=1; i<=1000; ++i) v[i].clear();
    for(int i=1; i<=m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x].push_back(y);
    }
    int ok=0;
    for(int i=1; i<=n; ++i)
    {
        memset(vs, 0, sizeof(vs));
        dfs(i, ok);
        if(ok==1)
        {
            cout<<"YES";
            break;
        }
    }
    if(ok==0) cout<<"NO";
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