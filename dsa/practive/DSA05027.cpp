#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> a(n+1), c(n+1);
    for(int i=1; i<=n; ++i) cin>>a[i];
    for(int i=1; i<=n; ++i) cin>>c[i];
    vector<vector<int>> v(n+1, vector<int>(k+1, 0));
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=k; +j)
        {
            v[i][j]=max(v[i-1][j], c[i]+v[i-1][j-a[i]]);
        }
    }
    cout<<v[n][k]<<endl;
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