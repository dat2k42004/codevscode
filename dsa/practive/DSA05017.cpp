#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0; i<n; ++i)
    {
        cin>>a[i];
    }
    int v1[n]={0}, v2[n]={0};
    for(int i=0; i<n; ++i)
    {
        v1[i]=a[i];
        for(int j=0; j<i; ++j)
        {
            if(a[i]>a[j]) 
            {
                v1[i]=max(v1[i], a[i]+v1[j]);
            }
        }
    }
    int res=0;
    for(int i=n-1; i>=0; --i)
    {
        v2[i]=a[i];
        for(int j=i+1; j<n; ++j)
        {
            if(a[i]>a[j]) 
            {
                v2[i]=max(v2[i], v2[j]+a[i]);
            }
        }
        res=max(res, v1[i]+v2[i]-a[i]);
    }
    cout<<res;
    cout<<'\n';
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