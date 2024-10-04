#include <iostream>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

void solve()
{
    int n, m;
    cin>>n>>m;
    vector<int> v1(n), v2(m);
    multiset<int> s;
    for(int i=0; i<n; ++i) 
    {
        cin>>v1[i];
        s.insert(v1[i]);
    }
    for(int i=0; i<m; ++i)
    {
        cin>>v2[i];
        s.insert(v2[i]);
    }
    for(auto x: s) cout<<x<<" ";
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