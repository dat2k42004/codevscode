#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
#define ll long long
using namespace std;
ll mod=1e9+7;
void solve()
{
    int n, k;
    cin>>n>>k;
    vector<ll> v(n+1, 0);
    v[0]=1;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=k && i-j>=0; ++j)
        {
            v[i]=(v[i]+v[i-j])%mod;
        }
    }
    cout<<v[n]<<endl;
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