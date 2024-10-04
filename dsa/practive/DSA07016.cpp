#include <iostream>
#include <stack>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    string s, r;
    cin>>s;
    stack<int> st;
    int k=0;
    for(int i=0; i<s.size(); ++i)
    {
        if(s[i]=='D')
        {
            if(i==0 || s[i-1]=='I')
            {
                st.push(k+1);
                k++;
            }
            st.push(k+1);
            k++;
        }
        else
        {
            while(st.size())
            {
                cout<<st.top();
                st.pop();
            }
            if(i==0)
            {
                cout<<k+1;
                k++;
            }
            if(s[i+1]!='D')
            {
                cout<<k+1;
                k+1;
            }
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