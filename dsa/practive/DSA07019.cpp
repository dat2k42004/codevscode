#include <iostream>
#include <vector>
#include <algorithm>
#include <stack>
#define ll long long
using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<ll> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    ll res=0;
    int i=0;
    stack<ll> st;
    while(i<n)
    {
        if(st.empty() || v[i]>=v[st.top()])
        {
            st.push(i);
            i++;
        }
        else
        {
            int idx=st.top();
            st.pop();
            if(st.empty())
            {
                res=max(res, i*v[idx]);
            }
            else
            {
                res=max(res, (i-st.top()-1)*v[idx]);
            }
        }
    }
    while(!st.empty())
    {
        int idx=st.top();
        st.pop();
        if(st.empty()) res=max(res, v[idx]*i);
        else
        {
            res=max(res, v[idx]*(i-st.top()-1));
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