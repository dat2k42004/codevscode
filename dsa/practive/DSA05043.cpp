#include <iostream>

using namespace std;
void solve()
{
    string s;
    cin>>s;
    int n=s.size();
    int a[n][n]={0};
    for(int i=0; i<n; ++i) 
    {
        a[i][i]=1;
    }
    int cnt=1;
    for(int k=1; k<n; ++k)
    {
        for(int i=0; i<n-k; ++i)
        {
            int j=i+k;
            a[i][j]=((i+1>j-1 || a[i+1][j-1]) && s[i]==s[j]);
            if(a[i][j]) cnt=k+1;
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
