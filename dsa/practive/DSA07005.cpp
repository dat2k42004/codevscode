#include <iostream>
#include <stack>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    string s;
    cin>>s;
    stack<char> st;
    for(int i=s.size()-1; i>=0; --i)
    {
        if(s[i]=='(')
        {
            string r="";
            if(s[i-1]=='-')
            {
                while(st.top()!=')')
                {
                    if(st.top()=='+') r+="-";
                    else if(st.top()=='-') r+="+";
                    else r+=st.top();
                    st.pop();

                }
            }
            else 
            {
                while(st.top()!=')')
                {
                    r+=st.top();
                    st.pop();
                }
            }
            st.pop();
            for(int j=r.size()-1; j>=0; j--) st.push(r[j]);
        }
        else
        {
            st.push(s[i]);
        }
    }
    while(st.size())
    {
        cout<<st.top();
        st.pop();
    }
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