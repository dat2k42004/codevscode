#include <bits/stdc++.h>

using namespace std;

void solve()
{
    int n;
    cin>>n;
    int res=0, ok=0;
    for(int i=0; i<=n/7; ++i)
    {
        if((n-7*i)%4==0)
        {
            res=i;
            ok=1;
        }
    }
    if(ok==0) cout<<-1;
    else
    {
        int tmp=(n-7*res)/4;
        for(int i=1; i<=tmp; ++i) cout<<4;
        for(int i=1; i<=res; ++i) cout<<7;
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