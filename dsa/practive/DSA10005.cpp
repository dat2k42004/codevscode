#include <iostream>
#include <vector>

using namespace std;
void solve()
{
    int n, m;
    cin>>n>>m;
    vector<vector<int>> v1(n+1), v2(n+1);
    for(int i=1; i<=m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v1[x].push_back(y);
        v2[y].push_back(x);
    }
    int res=0;
    for(int i=1; i<=n; ++i)
    {
        if(v1[i].size()!=v2[i].size()) res++;
    }
    if(!res) cout<<1;
    else cout<<0;
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