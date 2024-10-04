#include <iostream>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

void solve()
{
    int n, m;
    cin>>n>>m;
    set<int> s;
    vector<int> a(n), b(m);
    for(int i=0; i<n; ++i)
    {
        cin>>a[i];
        s.insert(a[i]);
    }
    for(int i=0; i<m; ++i) 
    {
        cin>>b[i];
        s.insert(b[i]);
    }
    set<int> r;
    for(int i=0; i<n; i++)
    {
        if(find(b.begin(), b.end(), a[i])!=b.end()) r.insert(a[i]);
    }
    for(auto x: s) cout<<x<<' ';
    cout<<endl;
    for(auto x: r) cout<<x<<' ';
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