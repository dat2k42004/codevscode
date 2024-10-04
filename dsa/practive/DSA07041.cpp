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
    int cnt=0;
    for(int i=0; i<s.size(); ++i)
    {
        if(s[i]=='(') st.push(s[i]);
        else
        {
            if(st.size()>0)
            {
                cnt+=2;
                st.pop();
            }
        }
    }
    cout<<cnt<<endl;
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