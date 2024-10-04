#include <iostream>
#include <algorithm>
#include <vector>
#include <set>
#define ll long long

using namespace std;
void solve()
{
    int n, m, k;
    cin>>n>>m>>k;
    vector<ll> a(n), b(m), c(k);
    for(int i=0; i<n; ++i) cin>>a[i];
    for(int i=0; i<m; ++i) cin>>b[i];
    for(int i=0; i<k; ++i) cin>>c[i];
    int res=0;
    for(int i=0; i<n; ++i)
    {
        if(find(b.begin(), b.end(), a[i])!=b.end() && find(c.begin(), c.end(), a[i])!=c.end()) 
        {
            cout<<a[i]<<" ";
            res=1;
        }
    }
    if(res==0) cout<<-1;
    cout<<endl;
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