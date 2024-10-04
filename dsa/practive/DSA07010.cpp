#include <iostream>
#include <stack>
#include <algorithm>


using namespace std;
bool check(char x)
{
    if(x=='/' || x=='*' || x=='-' || x=='+') return 1;
    return 0;
}
void solve()
{
    string s, r;
    cin>>s;
    stack<string> st;
    for(int i=s.size()-1; i>=0; --i) 
    {
        if(check(s[i]))
        {
            r="";
            r+=st.top();
            st.pop();
            r+=st.top();
            st.pop();
            r+=s[i];
            st.push(r);
        }
        else st.push(string(1, s[i]));
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