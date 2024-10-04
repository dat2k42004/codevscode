#include <iostream>
#include <set>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    set<int> s;
    for(int i=0; i<n-1; ++i)
    {
        int x, y;
        cin>>x>>y;
        s.insert(x);
        s.insert(y);
    }
    if(s.size()!=n) cout<<"NO";
    else cout<<"YES";
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
    return 0;
}