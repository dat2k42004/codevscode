#include <iostream>
#include <stack>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n, m;
    cin>>n>>m;
    vector<vector<int>> v(n+1);
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
        cout<<i<<": ";
        for(int x: v[i]) cout<<x<<' ';
        cout<<endl;
    }
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