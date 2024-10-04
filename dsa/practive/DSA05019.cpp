#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n, m;
    cin>>n>>m;
    int a[n][m];
    vector<vector<pair<int, int>>> v(n, vector<pair<int, int>>(m, {0, 0}));
    int res=0;
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            cin>>a[i][j];
            if(a[i][j]==0) v[i][j]={0, 0};
            else
            {
                int x=1, y=1;
                if(j>0) x+=v[i][j-1].first;
                if(i>0) y+=v[i-1][j].second;
                v[i][j]={x, y};
            }
            if(i==0 || j==0) res=max(min(v[i][j].first, v[i][j].second), res);
            else
            {
                if(v[i][j].first<=v[i-1][j].first && v[i][j].second<=v[i][j-1].second) 
                    res=max(res, min(v[i][j].first, v[i][j].second));
            }
        }
    }
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            cout<<"("<<v[i][j].first<<' '<<v[i][j].second<<") ";
        }
        cout<<endl;
    }
    cout<<res<<endl;
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