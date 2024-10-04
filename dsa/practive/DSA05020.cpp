#include <iostream>
#include <vector>

using namespace std;
void solve()
{
    int n, m;
    cin>>n>>m;
    vector<vector<int>> v(n, vector<int>(m));
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j) cin>>v[i][j];
    }
    vector<vector<int>> a(n, vector<int>(m));
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<m; ++j)
        {
            if(i==0 && j==0) a[i][j]=v[i][j];
            else if(i==0 && j!=0) a[i][j]=a[i][j-1]+v[i][j];
            else if(i!=0 && j==0) a[i][j]=a[i-1][j]+v[i][j];
            else a[i][j]=min(a[i-1][j-1], min(a[i-1][j], a[i][j-1]))+v[i][j];
        }
    }
    cout<<a[n-1][m-1]<<endl;
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