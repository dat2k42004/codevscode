#include <bits/stdc++.h>

using namespace std;
int n, p, s;
vector<int> x;
vector<string> st;
bool nt(int n)
{
    if(n<2) return 0;
    else
    for(int i=2; i<=sqrt(n); ++i)
    {
        if(n%i==0) return 0;
    }
    return 1;
}
void next(int i, string r, int sum, int k)
{
    for(int j=i; j<=x.size(); ++j)
    {
        if(sum==s && k==n)
        {
            st.push_back(r);
            return;
        }
        else if(sum<s && k<n) next(j+1, r+to_string(x[j])+" ", sum+x[j], k+1);
        else return;
    }
}
void solve()
{
    cin>>n>>p>>s;
    st.clear();
    int res=upper_bound(x.begin(), x.end(), p)-x.begin();
    next(res, "", 0, 0);
    cout<<st.size()<<endl;
    for(string i: st) cout<<i<<endl;
}
int main()
{
    int t;
    cin>>t;
    for(int i=2; i<=200; ++i)
    {
        if(nt(i)) x.push_back(i);
    }
    while(t--)
    {
        solve();
    }
    return 0;
}