#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
int n, k, cnt=0;
vector<int> v(k+1), a(n+1);
void result()
{
    int tmp=1;
    for(int i=2; i<=k; ++i)
    {
        if(a[v[i]]<=a[v[i-1]]) 
        {
            tmp=0;
            return;
        }
    }
    if(tmp==1) cnt++;
}
void tri(int i)
{
    for(int j=v[i-1]+1; j<=n-k+i; ++j)
    {
        v[i]=j;
        if(i==k) result();
        else tri(i+1);
    }
}
void solve()
{
    cin>>n>>k;
    for(int i=1; i<=n; ++i) cin>>a[i];
    v[0]=0;
    tri(1);
    cout<<cnt;
}
int main()
{
    solve();
    system("pause");
    return 0;
}