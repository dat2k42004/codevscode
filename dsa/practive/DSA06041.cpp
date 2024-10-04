#include <iostream>
#include <algorithm>
#include <vector>
#include <map>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    int a[n];
    map<int, int> m;
    for(int i=0; i<n; ++i)
    {
        cin>>a[i];
        m[a[i]]++;
    }
    int res=0, cnt;
    for(auto x: m)
    {
        if(res<x.second)  
        {
            cnt=x.first;
            res=x.second;
        }
    }
    if(res>n/2) cout<<cnt;
    else cout<<"NO";
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