#include <bits/stdc++.h>

using namespace std;
int n, s, res, ok;
vector<int> v;
void next(int sum, int cnt, int i)
{
    for(int j=i; j<=n; ++j)
    {
        sum+=v[j];
        cnt++;
        if(sum==s)
        {
            res=min(res, cnt);
            ok=1;
            return;
        }
        else if(sum<s && j+1<=n) next(sum, cnt, j+1);
        sum-=v[j];
        cnt--;
    }
}
void solve()
{
    cin>>n>>s;
    v.clear();
    v.resize(n+1);
    for(int i=1; i<=n; ++i)
    {
        cin>>v[i];
    }
    res=1e9, ok=0;
    next(0, 0, 1);
    if(ok==0) cout<<-1;
    else cout<<res;
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