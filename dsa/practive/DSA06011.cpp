#include <iostream>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;


void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    int res=1e7;
    for(int i=0; i<n-1; ++i)
    {
        for(int j=i+1; j<n; ++j)
        {
            if(abs(v[i]+v[j])<abs(res)) res=v[i]+v[j];
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