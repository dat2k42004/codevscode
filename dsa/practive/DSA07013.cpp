#include <iostream>
#include <stack>
#include <algorithm>

using namespace std;
bool check(char c)
{
    if(c=='+' || c=='-' || c=='*' || c=='/') return 1;
    return 0;
}
void solve()
{
    string s;
    cin>>s;
    stack<int> st;
    for(int i=0; i<s.size(); ++i)
    {
        if(check(s[i]))
        {
            int k=0;
            k+=st.top();
            st.pop();
            if(s[i]=='+') k=k+st.top();
            else if(s[i]=='-') k=st.top()-k;
            else if(s[i]=='*') k=k*st.top();
            else k=st.top()/k;
            st.pop();
            st.push(k);
        }
        else 
        {
            st.push(s[i]-'0');
        }
    }
    cout<<st.top()<<endl;
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