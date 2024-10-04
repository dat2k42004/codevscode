#include <bits/stdc++.h>

using namespace std;
int m[100], n1[100], p1[100], v[100][100];
int n, res;
void next(int i, int sum)
{
    if(i==n+1)
    {
        res=max(res, sum);
        return;
    }
    for(int j=1; j<=n; ++j)
    {
        if(m[j]==0 && n1[i+j]==0 && p1[i-j+n]==0) 
        {
            m[j]=n1[i+j]=p1[i-j+n]=1;
            next(i+1, sum+v[j][i]);
            m[j]=n1[i+j]=p1[i-j+n]=0;
        }
    }
}
void solve()
{
    n=8, res=0;
    for(int i=1; i<=n; ++i) 
    {
        for(int j=1; j<=n; ++j) cin>>v[i][j];
    }
    next(1, 0);
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