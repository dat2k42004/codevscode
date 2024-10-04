#include <iostream>
#include <stack>
#include <vector>
#include <algorithm>
using namespace std;
string ts="+-*/^";
bool check(char x)
{
    for(int i=0; i<5; ++i)
    {
        if(ts[i]==x) return 1;
    }
    return 0;
}
int find(char x)
{
    if(x=='+' || x=='-') return 1;
    if(x=='*' || x=='/') return 2;
    if(x=='^') return 3;
    return 0;
}

using namespace std;
void solve()
{
    string s, r;
    cin>>s;
    stack<char> st;
    st.push('@');
    for(int i=0; i<s.size(); ++i)
    {
        if(s[i]=='(')
        {
            st.push(s[i]);
            continue;
        }
        if(s[i]==')')
        {
            while(st.top()!='(')
            {
                r+=st.top();
                st.pop();
            }
            st.pop();
            continue;
        }
        if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z'))
        {
            r+=s[i];
            continue;
        }
        if(check(s[i]))
        {
            while(find(st.top())>=find(s[i]))
            {
                r+=st.top();
                st.pop();
            }
            st.push(s[i]);
            continue;
        }
    }
    while(st.top()!='@')
    {
        r+=st.top();
        st.pop();
    }
    cout<<r<<endl;
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