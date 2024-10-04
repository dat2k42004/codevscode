#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;
int a[501][501];
int n, m;
vector<pair<int, int>> v{{1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}};
void bfs(int i, int j)
{
    a[i][j]=0;
    for(int k=0; k<8; ++k)
    {
        int i1=i+v[k].first, j1=j+v[k].second;
        if(i1>0 && i1<=n && j1>0 && j1<=m && a[i1][j1]==1)
        {
            bfs(i1, j1);
        }
    }
}
void solve()
{
    cin>>n>>m;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=m; ++j)
        {
            cin>>a[i][j];
        }
    }
    int cnt=0;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=m; ++j)
        {
            if(a[i][j]==1)
            {
                cnt++;
                bfs(i, j);
            }
        }
    }
    cout<<cnt<<endl;
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