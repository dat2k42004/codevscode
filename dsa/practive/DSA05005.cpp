#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    vector<int> f(n, 1e9+1);
    f[0]=0;
    int tmp=0;
    for(int i=0; i<n; ++i)
    {
        int k=upper_bound(f.begin(), f.end(), v[i])-f.begin();
        f[k]=v[i];
        tmp=max(tmp, k);
    }
    cout<<n-tmp<<endl;
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