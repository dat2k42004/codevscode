#include <iostream>
#include <vector>
#include <algorithm>


using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<long long> v(n+1);
    for(int i=1; i<=n; ++i) cin>>v[i];
    vector<long long> c(n+1);
    c[0]=0;
    c[1]=v[1]; c[2]=v[2];
    long long res=0;
    for(int i=3; i<=n; ++i)
    {
        c[i]=max(v[i]+c[i-3], v[i]+c[i-2]);
        res=max(res, c[i]);
    }
    cout<<res;
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