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
    int res=1;
    for(int k=2; k<=n; ++k)
    {
        for(int i=0; i<n-k+1; ++i)
        {
            int j=i+k-1;
            if(s[i]==s[j] && k==2)
            {
                a[i][j]=2;
            }
            else if(s[i]==s[j])
            {
                a[i][j]=a[i+1][j-1]+2;
            }
            else a[i][j]=max(a[i+1][j], a[i][j-1]);
        }
    }
    cout<<n-a[0][n-1]<<endl;
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