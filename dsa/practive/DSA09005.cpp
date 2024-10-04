#include <iostream>
#include <vector>
#include <queue>

using namespace std;
void solve()
{
    int n, m, u;
    cin>>n>>m>>u;
    vector<vector<int>> v(n+1, vector<int> (n+1, 0));
    for(int i=1; i<=m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x][y]=v[y][x]=1;
    }
    queue<int> q;
    vector<int> vs(n+1, 0);
    q.push(u);
    while(!q.empty())
    {
        int x=q.front();
        q.pop();
        if(vs[x]==0) 
        {
            cout<<x<<' ';
            vs[x]=1;
        }
        for(int i=1; i<=n; ++i)
        {
            if(vs[i]==0 && v[x][i]==1)
            {
                q.push(i);
            }
        }
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