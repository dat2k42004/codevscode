#include <iostream>
#include <stack>
#include <algorithm>
#include <cstring>

using namespace std;
void solve()
{
    string s;
    cin>>s;
    stack<char> st;
    int ok=1;
    for(int i=0; i<s.size(); ++i)
    {
        if(!st.empty() && (s[i]==')' || s[i]=='}' || s[i]==']'))
        {
            if((s[i]==')' && st.top()=='(') || (s[i]==']' && st.top()=='[') || (s[i]=='}' && st.top()=='{'))
            {
                st.pop();
            }
            else 
            {
                ok=0;
                break;
            }
        }
        else st.push(s[i]);
    }
    if(ok==1) cout<<"YES";
    else cout<<"NO";
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