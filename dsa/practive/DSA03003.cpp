#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
long long mod=1e9+7;
void solve()
{
    int n;
    cin>>n;
    vector<long long> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    sort(v.begin(), v.end());
    long long res=0;
    for(int i=n-1; i>=0; --i)
    {
        long long cnt=((i%mod)*(v[i]%mod)%mod);
        res=(res+cnt)%mod; 
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