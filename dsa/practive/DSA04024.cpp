#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;
long long mod=1e9+7;
struct data
{
    long long x[10][10];
};
int n;
struct data operator * (struct data a, struct data b)
{
    struct data v;
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<n; ++j)
        {
            v.x[i][j]=0;
            for(int k=0; k<n; ++k)
            {
                v.x[i][j]=(v.x[i][j]+(a.x[i][k]*b.x[k][j])%mod)%mod;
            }
        }
    }
    return v;
}
struct data poww(struct data a, long long k)
{
    if(k==1) return a;
    else if(k%2==1) return a*poww(a, k-1);
    struct data v=poww(a, k/2);
    return v*v;
}

void solve()
{
    int k;
    cin>>n>>k;
    struct data a;
    for(int i=0; i<n; ++i)
    {
        for(int j=0; j<n; ++j) cin>>a.x[i][j];
    }
    a=poww(a, k);
    int res=0;
    for(int i=0; i<n; ++i)
    {
        res=(res+a.x[i][n-1])%mod;
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
    system("pause");
    return 0;
}