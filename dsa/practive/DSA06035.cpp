#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n+1), maxv(n+1), minv(n+1);
    int res=0;
    for(int i=1; i<=n; ++i) cin>>v[i];
    maxv[n]=minv[n]=n;
    for(int i=n-1; i>=1; --i)
    {
        if(v[i]>v[i+1])
        {
            minv[i]=minv[i+1];
        }
        else 
        {
            minv[i]=i;
        }
        if(v[i]<v[i+1])
        {
            maxv[i]=maxv[i+1];
        }
        else
        {
            maxv[i]=i;
        }
    } 
    for(int i=1; i<=n; ++i)
    {
        res=max(res, minv[maxv[i]]-i+1);
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