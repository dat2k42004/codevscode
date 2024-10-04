#include <iostream>
#include <stack>
#include <algorithm>
#include <vector>
#include <cmath>

using namespace std;
void solve()
{
    string s;
    cin>>s;
    int n=s.size();
    stack<pair<int, int>> st;
    vector<int> v(n, 0);
    int cnt=0;
    for(int i=0; i<n; ++i)
    {
        if(s[i]==')' && !st.empty() && st.top().first=='(')
        {
            v[i]=v[i-1];
            if(st.top().second!=0)
            {
                v[i]+=v[st.top().second-1];
            }
            v[i]+=2;
            st.pop();
        }
        else st.push({s[i], i});
    }
    for(int i=0; i<n; ++i)
    {
        cnt=max(cnt, v[i]);
    }
    cout<<cnt<<endl;
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