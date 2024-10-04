#include <bits/stdc++.h>
#include <vector>
#include <stack>
#include <algorithm>

using namespace std;
void solve()
{
    string s;
    cin>>s;
    int cnt=0;
    stack<char> st;
    if(s.size()%2==1) 
    {
        cout<<-1;
    }
    for(int i=0; i<s.size(); ++i)
    {
        if(!st.empty() && s[i]==')')
        {
            if(st.top()=='(')
            {
                st.pop();
            }
            else{
                st.push(s[i]);
            }
        }
        else 
        {
            st.push(s[i]);
        }
    }
    int res=st.size(), n=0;
    while(!st.empty() && st.top()=='(')
    {
        st.pop();
        n++;
    }
    cout<<(res/2+n%2);
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