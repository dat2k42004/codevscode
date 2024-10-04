#include <iostream>
#include <stack>
#include <vector>
#include <algorithm>


using namespace std;
vector<vector<int>> v;
vector<int> vs; 
void dfs(int n, int x, int y)
{
    stack<int> s;
    s.push(n);
    while(!s.empty())
    {
        int u=s.top();
        s.pop();
        for(auto i: v[u])
        {
            if((u==x && i==y) || (u==y && i==x)) continue;
            if(vs[i]==0)
            {
                vs[i]=1;
                s.push(u);
                s.push(i);
                break;
            }
        }
    }
}
void solve()
{
    int n, m;
    cin>>n>>m;
    v.clear();
    v.resize(n+1);
    vector<pair<int, int>> a(m);
    for(int i=0; i<m; ++i)
    {
        cin>>a[i].first>>a[i].second;
        v[a[i].first].push_back(a[i].second);
        v[a[i].second].push_back(a[i].first);
    }
    sort(a.begin(), a.end());
    int res=0;
    vs.clear();
    vs.resize(n+1, 0);
    for(int i=1; i<=n; ++i)
    {
        if(vs[i]==0)
        {
            res++;
            vs[i]=1;
            dfs(i, -1, -1);
        }
    }
    for(int i=0; i<m; ++i)
    {
        vs.clear();
        vs.resize(n+1, 0);
        int cnt=0;
        for(int j=1; j<=n; ++j)
        {
            if(vs[j]==0)
            {
                cnt++;
                vs[j]=1;
                dfs(j, a[i].first, a[i].second);
            }
        }
        if(cnt>res) cout<<a[i].first<<' '<<a[i].second<<' ';
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