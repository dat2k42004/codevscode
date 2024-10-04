#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>

using namespace std;
string chance(string s)
{
    string r, res="";
    stack<char> st, a;
    char x, y;
    for(int i=0; i<s.size(); ++i)
    {
        if(s[i]=='(')
        {
            st.push(s[i]);
            a.push(s[i-1]);
        }
        else if(s[i]==')')
        {
            r="";
            while(st.size())
            {
                x=st.top();
                st.pop();
                y=st.top();
                st.pop();
                if(a.top()=='-')
                {
                    r=x+r;
                    if(y=='-')
                    {
                        r="+"+r;
                    }
                    else
                    {
                        r="-"+r;
                    }
                }
                else
                {
                    r=x+r;
                    r=y+r;
                }
                if(y=='(')
                {
                    for(int j=1; j<r.size(); ++j)
                    {
                        st.push(r[j]);
                    }
                    break;
                }
            }
            a.pop();
        }
        else st.push(s[i]);
    }
    while(st.size())
    {
        res=st.top()+res;
        st.pop();
    }
    return res;
}
void solve()
{
    string s1, s2, r;
    cin>>s1>>s2;
    string kq1=chance(s1), kq2=chance(s2);
    if(kq1==kq2) cout<<"YES";
    else cout<<"NO";
    cout<<"\n";
}

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    return 0;
}