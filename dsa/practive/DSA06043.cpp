#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector <int> v(n), kq(n);
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
        if(i==0) kq[i]=v[i];
        else kq[i]=kq[i-1]+v[i];
    }
    int res=-2;
    for(int i=1; i<n-1; ++i)
    {
        if(kq[i]-v[i]==kq[n-1]-kq[i]) res=i;
    }
    cout<<res+1<<endl;
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