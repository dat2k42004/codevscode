#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int c, n;
    cin>>c>>n;
    vector<int> v(n+1);
    for(int i=1; i<=n; ++i) cin>>v[i];
    vector<vector<int>> kq(n+1, vector<int>(c+1, 0));
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=c; ++j)
        {
            if(v[i]<=j)
            {
                kq[i][j]=max(kq[i-1][j], v[i]+kq[i-1][j-v[i]]);
            }
            else 
            {
                kq[i][j]=kq[i-1][j];
            }
        }
    }
    cout<<kq[n][c]<<endl;
}
int main()
{
    solve();
    system("pause");
    return 0;
}