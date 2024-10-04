#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    int x, y, z;
    cin>>x>>y>>z;
    vector<int> v(n+2, 0); 
    v[1]=x;
    v[2]=v[1]+min(x, z);
    for(int i=3; i<=n+1; ++i)
    {
        v[i]=v[i-1]+x;
        if(i%2==0)
        {
            v[i]=min(v[i], v[i/2]+z);
            v[i-1]=min(v[i-1], v[i]+y);
        }
    }
    cout<<v[n]<<endl;
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