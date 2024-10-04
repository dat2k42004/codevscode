#include <iostream>
#include <algorithm>
#include <vector>
#include <cmath>

using namespace std;
void solve()
{
    int n, x;
    cin>>n>>x;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    int res=lower_bound(v.begin(), v.end(), x)-v.begin();
    if(v[res]!=x) res--;
    if(res!=-1) res++;
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