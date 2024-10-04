#include <iostream>
#include <stack>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    string s;
    getline(cin, s);
    stack<char> st;
    int ok=0;
    for(int i=0; i<s.size(); ++i)
    {
        if(s[i]=='(' || s[i]=='*' || s[i]=='+' || s[i]=='-' && s[i]=='/')
        {
            st.push(s[i]);
        }
        if(s[i]==')')
        {
            if(st.top()=='(')
            {
                ok=1;
                break;
            }
            while(st.size() && st.top()!='(')
            {
                st.pop();
            }
            st.pop();
        }
    }
    if(ok==1) cout<<"Yes";
    else cout<<"No";
    cout<<endl;
}
int main()
{
    int t;
    cin>>t;
    cin.ignore();
    while(t--)
    {
        solve();
    }
    system("pause");
    return 0;
}