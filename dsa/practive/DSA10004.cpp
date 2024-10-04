#include <iostream>
#include <vector>

using namespace std;
void solve()
{
    int n, m;
    cin>>n>>m;
    vector<vector<int>> v(n+1);
    for(int i=1; i<=m; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x].push_back(y);
        v[y].push_back(x);
    }
    int cnt=0, res=0;
    for(int i=1; i<=n; ++i)
    {
        if(v[i].size() && v[i].size()%2==0) cnt++;
        else if(v[i].size() && v[i].size()%2==1) res++;
    }
    if(cnt==n) cout<<2;
    else if(res==2) cout<<1;
    else cout<<0;
    cout<<"\n";

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