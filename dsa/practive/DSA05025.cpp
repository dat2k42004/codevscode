#include <iostream>
#include <vector>
#include <algorithm> 
#define ll long long 
using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<ll> v(n+1, 0);
    v[0]=1;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=3 && i-j>=0; ++j)
        {
            v[i]=v[i]+v[i-j];
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