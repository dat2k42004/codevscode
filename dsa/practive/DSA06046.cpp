#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    sort(v.begin(), v.end());
    int res=1e6;
    for(int i=0; i<n-1; ++i)
    {
        res=min(res, v[i+1]-v[i]);
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