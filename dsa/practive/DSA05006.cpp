#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int>v(n), kq(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    int res=0;
    for(int i=0; i<n; ++i)
    {
        kq[i]=v[i];
        for(int j=0; j<i; ++j)
        {
            if(v[i]>=v[j]) kq[i]=max(kq[i], kq[j]+v[i]);
        }
        res=max(res, kq[i]);
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
    return 0;
}