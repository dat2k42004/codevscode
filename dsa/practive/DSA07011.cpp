#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>

using namespace std;
string x="+-*/";
int check(char c)
{
    for(int i=0; i<x.size(); ++i) 
    {
        if(c==x[i]) return 1;
    }
    return 0;
}
void solve()
{
    string s, r;
    cin>>s;
    stack<string> st;
    for(int i=0; i<s.size(); ++i)
    {
        if(check(s[i]))
        {
            r="";
            r+=st.top();
            st.pop();
            r=st.top()+r;
            st.pop();
            r=s[i]+r;
            st.push(r);
        }
        else 
        {
            st.push(string(1, s[i]));
        }
    }
    cout<<st.top()<<"\n";
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