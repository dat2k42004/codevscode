#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    int n, x;
    cin>>n>>x;
    vector<int> v(n);
    int res;
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
        if(v[i]==x) res=i+1;
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