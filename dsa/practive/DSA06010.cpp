#include <iostream>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;



void solve()
{
    int n;
    cin>>n;
    set<char> s;
    string x;
    for(int i=0; i<n; ++i)
    {
        cin>>x;
        for(int j=0; j<x.size(); ++j) s.insert(x[j]);
    }
    for(auto x:s) cout<<x<<' ';
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