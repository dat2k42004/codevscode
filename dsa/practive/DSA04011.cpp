#include <bits/stdc++.h>

using namespace std;
void solve()
{
    string a, b;
    cin>>a>>b;
    long long x=0, y=0;
    for(int i=0; i<a.size(); ++i)
    {
        x+=(a[i]-'0')*pow(2, a.size()-i-1);
    }
    for(int i=0; i<b.size(); ++i)
    {
        y+=(b[i]-'0')*pow(2, b.size()-i-1);
    }
    cout<<x*y<<endl;
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