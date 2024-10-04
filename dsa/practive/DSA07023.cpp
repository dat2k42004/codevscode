#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>

using namespace std;
void solve()
{
    string s, r="";
    getline(cin, s);
    stack<char> st;
    for(int i=s.size()-1; i>=0; --i)
    {
        if(s[i]==' ')
        {
            while(!st.empty())
            {
                r+=st.top();
                st.pop();
            }
            r+=" ";
        }
        else 
        {
            st.push(s[i]);
        }
    }
    while(!st.empty())
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
    cin.ignore();
    while(t--)
    {
        solve();
    }
    system("pause");
    return 0;
}