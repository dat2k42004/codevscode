#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
#include <set>
using namespace std;
int n;
int a[10][10];
set<string> v;
vector<pair<string, pair<int, int>>> p = {{"D", {1, 0}}, {"L", {0, -1}}, {"R", {0, 1}}, {"U", {-1, 0}}};
void next(int i, int j, string r)
{
    if(i==n && j==n)
    {
        v.insert(r);
        return ;
    }
    for(int k=0; k<4; ++k)
    {
        int i1=i+p[k].second.first, j1=j+p[k].second.second;
        if(i1>=1 && i1<=n && j1>=1 && j1<=n && a[i1][j1])
        {
            a[i1][j1]=0;
            next(i1, j1, r+p[k].first);
            a[i1][j1]=1;
        }
    }
}
void solve()
{
    cin>>n;
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=n; ++j) cin>>a[i][j];
    }
    v.clear();
    if(a[1][1]==1)
    {
        a[1][1]=0;
        next(1, 1, "");
    }
    if(v.size()==0) cout<<-1;
    for(string x: v) 
    {
        cout<<x<<' ';
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