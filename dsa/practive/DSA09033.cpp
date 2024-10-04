#include <iostream>
#include <algorithm>
#include <vector>
#include <cstring>
using namespace std;
void solve()
{
    int n, m, ok=1;
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
        for(int x: v[i])
        {
            if(v[x].size()!=v[i].size())
            {
                ok=0;
                cout<<"NO";
                break;
            }
        }
        if(ok==0) break;
    }
    if(ok) cout<<"YES";
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