#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n+1), f(n+1, 0);
    for(int i=0; i<n; ++i) cin>>v[i];
    int res=0;
    for(int i=0; i<n; ++i)
    {
        f[v[i]]=f[v[i]-1]+1;
        res=max(res, f[v[i]]);
    }
    cout<<n-res<<endl;
}
int main()
{
    solve();
    system("pause");
    return 0;
}