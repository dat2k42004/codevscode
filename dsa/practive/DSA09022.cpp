#include <iostream>
#include <stack>
#include <algorithm>
#include <vector>

using namespace std;
vector<int> vs;
vector<vector<int>> v;
void dfs(int u)
{
    stack<int> s;
    s.push(u);
    while(!s.empty())
    {
        int x=s.top();
        s.pop();
        if(vs[x]==0)
        {
            cout<<x<<' ';
            vs[x]=1;
        }
        for(int i: v[x])
        {
            if(vs[i]==0)
            {
                s.push(x);
                s.push(i);
                break;
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
    dfs(k);
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