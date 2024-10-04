#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
int n, m;
int a[101][101];
int res;

void next(int i, int j)
{
    if(i==n && j==m)
    {
        res++;
        return;
    }
    if(i<n) next(i+1, j);
    if(j<m) next(i, j+1);
}

void solve()
{
    cin>>n>>m;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=m; j++)
        {
            cin>>a[i][j];
        }
    }
    res=0;
    next(1, 1);
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
    system("pause");
    return 0;
}