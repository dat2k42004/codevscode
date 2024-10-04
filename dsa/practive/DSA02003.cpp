#include <iostream>
#include <vector>
#include <algorithm>
#include <string.h>
using namespace std;

int a[12][12];
int n;
vector<string> v;
void next(int i, int j, string s)
{
    if(i==n && j==n)
    {
        v.push_back(s);
        return ;
    }
    if(a[i+1][j]==1 && i<n) 
    {
        next(i+1, j, s+"D");
    }
    if(a[i][j+1]==1 && j<n)
    {
        next(i, j+1, s+"R");
    }
}

void solve()
{
    cin>>n;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=n; ++j) cin>>a[i][j];
    }
    if(a[1][1]==1) next(1, 1, "");
    if(v.size()==0) cout<<-1;
    else
    {
        for(int i=0; i<v.size(); ++i) cout<<v[i]<<" ";
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
    system("pause");
    return 0;
}