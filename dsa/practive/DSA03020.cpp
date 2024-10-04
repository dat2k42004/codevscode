#include <iostream>
#include <stack>

using namespace std;
void solve()
{
    string s;
    cin>>s;
    stack<char> st;
    int dele=0, res=0;
    for(int i=0; i<s.size(); ++i)
    {
        if(st.empty()) st.push(s[i]);
        else if(st.top()=='[' && s[i]==']')
        {
            dele += 2;
            st.pop();
        }
        else if(s[i]=='[' && st.top()==']') 
        {
            res+=st.size()+dele;
            st.pop();
        }
        else if(s[i]=='[') st.push(s[i]);
        else if(s[i]==']' && st.top()==']')
        {
            st.push(s[i]);
        }
        if(st.size()==0) dele=0;
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
    return 0;
}