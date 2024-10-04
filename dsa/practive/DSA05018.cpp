#include <bits/stdc++.h>

using namespace std;
void solve()
{
    string s;
    cin>>s;
    int n=s.size();
    int f[n][n]={0};
    for(int i=0; i<n; ++i) f[i][i]=1;
    int cnt=1;
    for(int i=1; i<n; ++i)
    {
        for(int j=0; j<n-i; ++j)
        {
            int k=i+j;
            f[j][k]=((j+1>k-1 || f[j+1][k-1]) && s[j]==s[k]);
            if(f[j][k]) cnt=i+1;
        }
    }
    cout<<cnt<<endl;
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