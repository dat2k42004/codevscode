#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n), l(n), r(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    int res=0;
    stack<int> st;
    for(int i=0; i<n; ++i)
    {
        while(!st.empty() && v[i]<=v[st.top()]) st.pop();
        if(st.empty()) l[i]=0;
        else l[i]=st.top()+1;
        st.push(i);
    }
    while(st.size()) st.pop();
    for(int i=n-1; i>=0; --i)
    {
        while(!st.empty() && v[i]<=v[st.top()]) st.pop();
        if(st.empty()) r[i]=n-1;
        else r[i]=st.top()-1;
        st.push(i);
    }
    for(int i=0; i<n; ++i)
    {
        if(r[i]-l[i]+1>=v[i]) res=max(res, v[i]);
    }
    cout<<res<<'\n';
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