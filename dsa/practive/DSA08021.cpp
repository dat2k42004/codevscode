#include <iostream>
#include <queue>
#include <algorithm>
#include <vector>
#include <cmath>
#include <set>

using namespace std;
void solve()
{
    int m, n;
    cin>>m>>n;
    vector<vector<int>> v(m+1, vector<int>(n+1));
    for(int i=1; i<=m; ++i)
    {
        for(int j=1; j<=n; ++j) cin>>v[i][j];
    }
    queue<pair<pair<int, int>, int>> q;
    pair<pair<int, int>, int> p;
    q.push({{1, 1}, 0});
    int res=1e9, ok=0;
    set<pair<int, int>> s;
    while(q.size())
    {
        p=q.front();
        q.pop();
        int i=p.first.first, j=p.first.second;
        if(i==m && j==n)
        {
            ok=1;
            res=min(p.second, res);
        }
        if(j+v[i][j]<=n && s.count({i, j+v[i][j]})==0) 
        {
            q.push({{i, j+v[i][j]}, p.second+1});
            s.insert({i, j+v[i][j]});
        }
        if(i+v[i][j]<=m && s.count({i+v[i][j], j})==0) 
        {
            q.push({{i+v[i][j], j}, p.second+1});
            s.insert({i+v[i][j], j});
        }
    }
    if(ok==0) cout<<-1;
    else cout<<res;
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