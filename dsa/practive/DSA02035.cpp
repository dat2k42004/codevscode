#include <bits/stdc++.h>

using namespace std;
int n, k;
vector<string> v;
int a[10], u[10];
int res=1e9;
int chance(string s)
{
    int r=0;
    for(int i=1; i<=k; ++i)
    {
        r=r*10+s[a[i]-1]-'0';
    }
    return r;
}
void next(int i)
{
    for(int j=1; j<=k; ++j)
    {
        if(u[j]==0)
        {
            a[i]=j;
            u[j]=1;
            if(i==k)
            {
                int res1=0, res2=1e9;
                for(int i1=1; i1<=n; ++i1)
                {
                    int tmp=chance(v[i1]);
                    res1=max(res1, tmp);
                    res2=min(res2, tmp);
                }
                res=min(res1-res2, res);
            }
            else next(i+1);
            u[j]=0;
        }
    }
}
void solve()
{
    cin>>n>>k;
    v.resize(n+1);
    for(int i=1; i<=n; ++i) cin>>v[i];
    for(int i=0; i<10; ++i) a[i]=u[i]=0;
    next(1);
    cout<<res<<endl;
}
int main()
{
    solve();
    return 0;
}