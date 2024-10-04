#include <bits/stdc++.h>

using namespace std;
int n, res;
void next(int n, int cnt)
{
    if(n==1)
    {
        res=min(res, cnt);
        return;
    }
    if(n%2==0) next(n/2, cnt+1);
    if(n%3==0) next(n/3, cnt+1);
    if(n%6!=0) next(n-1, cnt+1);
}
void solve()
{
    cin>>n;
    res=1e9;
    next(n, 0);
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
    return 0;
}