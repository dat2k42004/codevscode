#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
    }
    sort(v.begin(), v.end());
    for(int x: v) cout<<x<<' ';
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