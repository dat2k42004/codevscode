#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int n, k;
    cin>>n>>k;
    int a[n];
    for(int i=0; i<n; ++i) cin>>a[i];
    long long sum=0;
    sort(a, a+n);
    for(int i=0; i<n-1; ++i)
    {
        int x=lower_bound(a+i+1, a+n, a[i]+k)-a;
        sum+=x-i-1;
    }
    cout<<sum<<endl;
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