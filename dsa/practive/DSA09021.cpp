#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

void solve()
{
    int n;
    cin>>n;
    vector<vector<int>> v(n+1, vector<int>(n+1));
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=n; ++j) 
        {
            cin>>v[i][j];
        }
    }
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=n; ++j) 
        {
            if(v[i][j]==1) cout<<j<<' ';
        }
        cout<<endl;
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}