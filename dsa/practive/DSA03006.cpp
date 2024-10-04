#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n), a(n);
    for(int i=0; i<n; ++i) cin>>v[i], a[i]=v[i];
    sort(a.begin(), a.end());
    int res=1;
    for(int i=0; i<n; ++i)
    {
        if(a[i]!=v[i] && a[i]!=v[n-1-i]) 
        {
            res=0;
            break;
        }
    }
    if(res==0) cout<<"No";
    else cout<<"Yes";
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