#include <iostream>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    long long a[n+2];
    a[0]=a[1]=0;
    for(int i=2; i<n+2; ++i)
    {
        cin>>a[i];
        a[i]=max(a[i-1], a[i-2]+a[i]);
    }
    cout<<max(a[n], a[n+1])<<endl;
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