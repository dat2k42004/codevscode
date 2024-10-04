#include <iostream>
#include <cstring>
#include <vector>
#include <algorithm>
using namespace std;
int n, res;
string v[100];
vector<int> a;
int lap(string s, string r)
{
    int cnt=0;
    for(int i=0; i<s.size(); ++i)
    {
        for(int j=0; j<=r.size(); ++j)
        {
            if(s[i]==r[j]) cnt++;
        }
    }
    return cnt;
}
void next(int i, int sum, int k)
{
   for(int j=1; j<=n; ++j)
   {
        if(a[j]==0)
        {
            a[j]=1;
            if(i==n) res=min(res, sum+lap(v[j], v[k]));
            else if(res > sum && i<n) next(i+1, sum+lap(v[j], v[k]), j);
            a[j]=0;
        }
   }
}
void solve()
{
    cin>>n;
    for(int i=1; i<=n; ++i) cin>>v[i];
    a.resize(n+1, 0);
    res=1e9;
    next(1, 0, 0);
    cout<<res<<endl;
}
int main()
{
    solve();
}