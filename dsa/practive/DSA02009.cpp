#include <bits/stdc++.h>

using namespace std;
int n, k, sum;
vector<int> v;
int ok;
int a[21];
void next(int sum, int cnt)
{
    if(cnt==k)
    {
        ok=1;
        return;
    }
    for(int i=1; i<=n; ++i)
    {
        if(a[i]==0)
        {
            sum+=a[i];
            a[i]=1;
            if(sum==k) next(0, cnt+1);
            else if(sum<k) next(sum, cnt);
            else return;
            a[i]=0;
            sum-=a[i];
        }
    }
}
void solve()
{
    cin>>n>>k;
    v.clear();
    v.resize(n+1);
    sum=0;
    for(int i=1; i<=n; ++i)
    {
        cin>>v[i];
        sum+=v[i];
    }
    if(sum%k!=0) cout<<0;
    else 
    {
        sum/=k;
        for(int i=0; i<=20; ++i) a[i]=0;
        next(0, 0);
        cout<<ok;
    }
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
    return 0;
}