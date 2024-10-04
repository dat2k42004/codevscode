#include <iostream>
#include <math.h>
#include <algorithm>
#include <vector>

using namespace std;
int binary_search(vector<int>& a, int n, int x)
{
    int l=0, r=n-1;
    int result=-1;
    while(l<=r)
    {
        int m=(l+r)/2;
        if(a[m]>x)
        {
            result=m;
            r=m-1;
        }
        else
        {
            l=m+1;
        }
    }
    return result+1;
}
void solve()
{
    int n, m;
    cin>>n>>m;
    vector<int> x(n), y(m);
    for(int i=0; i<n; ++i) cin>>x[i];
    for(int i=0; i<m; ++i) cin>>y[i];
    int cnt=0;
    sort(y.begin(), y.end());
    for(int i=0; i<n; ++i)
    {
        if(x[i]==0) continue;
        else if(x[i]>0)
        {
            int idx=binary_search(y, m, x[i]);
            cnt+=m-idx;
        }
        else
        {
            int idx=binary_search(y, m, x[i]);
            cnt+=idx;
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
    system("pause");
    return 0;
}