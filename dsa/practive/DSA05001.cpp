#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>

using namespace std;
void solve()
{
    string a, b;
    cin>>a>>b;
    a=" "+a;
    b=" "+b;
    int n=a.size(), m=b.size();
    int v[n][m];
    for(int i=0; i<n; ++i) v[i][0]=0;
    for(int i=0; i<m; ++i) v[0][i]=0;
    int res=0;
    for(int i=1; i<n; ++i)
    {
        for(int j=1; j<m; ++j)
        {
            if(a[i]==b[j])
            {
                v[i][j]=v[i-1][j-1]+1;
            }
            else v[i][j]=max(v[i-1][j], v[i][j-1]);
            res=max(v[i][j], res);
        }
    }
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
    system("pause");
    return 0;
}