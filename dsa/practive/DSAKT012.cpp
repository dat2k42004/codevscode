#include <bits/stdc++.h>

using namespace std;
int n, s, res, ok;
vector<int> v;
void next(int sum, int i, int cnt)
{
    for(int j=i; j<=n; ++j)
    {
        sum+=v[j];
        cnt++;
        if(sum==s) 
        {
            res=min(cnt, res);
            ok=1;
            return;
        }
        else if(sum<s) next(sum, j+1, cnt);
        cnt--;
        sum-=v[j];
    }
}
void solve()
{
    cin>>n>>s;
    v.resize(n+1);
    for(int i=1; i<=n; ++i) cin>>v[i];
    res=1e9, ok=0;
    next(0, 1, 0);
    if(ok==0) cout<<-1;
    else cout<<res;
    cout<<endl;
}
int main()
{
    solve();
    return 0;
}