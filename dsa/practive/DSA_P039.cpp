#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<vector<int>> v(n);
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<n; ++j) cin>>v[i][j];
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