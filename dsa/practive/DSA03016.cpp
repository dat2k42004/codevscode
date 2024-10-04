#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int s, d;
    cin>>s>>d;
    if(d*9<s) cout<<-1;
    else
    {
        int n=d;
        int a[n]={0};
        while(s>9 && d>1)
        {
            a[d-1]=9;
            s-=9;
            d--;
        }
        if(d>=2)
        {
            a[d-1]=s-1;
            a[0]=1;
        }
        else a[d-1]=s;
        for(int i=0; i<n; ++i) cout<<a[i];
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