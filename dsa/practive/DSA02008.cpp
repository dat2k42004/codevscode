#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;
int n, k;
vector<int> v, u;
int a[12][12], kq[1000001][12];
int cnt;
void result()
{
    int sum=0;
    for(int i=1; i<=n; ++i)
    {
        sum+=a[i][v[i]];
    }
    if(sum==k) 
    {
        cnt++;
        for(int i=1; i<=n; ++i) kq[cnt][i]=v[i];
    }
}
void next(int i)
{
    for(int j=1; j<=n; ++j)
    {
        if(u[j]==0)
        {
            v[i]=j;
            u[j]=1;
            if(i==n)
            {
                result();
            }
            else next(i+1);
            u[j]=0;
        }
    }
}
void solve()
{
    cin>>n>>k;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=n; ++j) cin>>a[i][j];
    }
    v.resize(n+1);
    u.resize(n+1, 0);
    cnt=0;
    next(1);
    cout<<cnt<<endl;
    for(int i=1; i<=cnt; ++i)
    {
        for(int j=1; j<=n; ++j) cout<<kq[i][j]<<" ";
        cout<<endl;
    }
}
int main()
{
    solve();
    return 0;
}