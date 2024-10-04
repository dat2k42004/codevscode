#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n, k;
    cin>>n>>k;
    int a[n];
    for(int i=0; i<n; ++i) cin>>a[i];
    sort(a, a+n);
    long long res=0;
    for(int i=0; i<n; ++i)
    {
        int x=lower_bound(a+i+1, a+n, a[i]+k)-a;
        res+=x-i-1;
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