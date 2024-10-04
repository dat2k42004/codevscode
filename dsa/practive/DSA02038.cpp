#include <bits/stdc++.h>

using namespace std;

void solve()
{
    int n, k;
    cin>>n>>k;
    int a[n+1], b[k+1];
    for(int i=1; i<=n; ++i) cin>>a[i];
    sort(a+1, a+n+1);
    for(int i=1; i<=k; ++i) b[i]=i;
    while(1)
    {
        for(int i=1; i<=k; ++i) cout<<a[b[i]]<<' ';
        cout<<'\n';
        int ok=0;
        for(int i=k; i>=1; --i)
        {
            if(b[i]!=n-k+i) 
            {
                ok=1;
                b[i]++;
                for(int j=i+1; j<=k; ++j) b[j]=b[i]+j-i;
                break;
            }
        }
        if(ok==0) break;
    }
    
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