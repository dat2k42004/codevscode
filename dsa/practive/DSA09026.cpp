#include <iostream>
#include <queue>
#include <vector>

using namespace std;
void solve()
{
    int n, m, x, y;
    cin>>n>>m>>x>>y;
    vector<vector<int>> v(n+1);
    for(int i=0; i<m; ++i)
    {
        int a, b;
        cin>>a>>b;
        v[a].push_back(b);
    }
    queue<int> q;
    q.push(x);
    int vs[n+1]={0}, e[n+1]={0};
    vs[x]=1;
    while(!q.empty())
    {
        int u=q.front();
        q.pop();
        for(int i: v[u])
        {
            if(vs[i]==0)
            {
                vs[i]=1;
                e[i]=u;
                q.push(i);
            }
        }
    }
    if(vs[y]==0) cout<<-1;
    else
    {
        int t=y;
        vector<int> kq;
        while(t!=x)
        {
            kq.push_back(t);
            t=e[t];
        }
        kq.push_back(t);
        for(int i=kq.size()-1; i>=0; --i) cout<<kq[i]<<' ';
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