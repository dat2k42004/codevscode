#include <bits/stdc++.h>

using namespace std;
int n;
string s;
set<string> st;
void next(int i, string r)
{
    for(int j=i; j<n; ++j)
    {
        r+=s[j];
        st.insert(r);
        if(j+1<n) next(j+1, r);
        r.erase(r.size()-1, 1);
    }
}
void solve()
{
    cin>>n>>s;
    st.clear();
    next(0, "");
    for(string x: st) cout<<x<<' ';
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