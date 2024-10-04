#include <bits/stdc++.h>

using namespace std;
string s;
int ok;
vector<string> v;
int check(string s)
{
    stack<char> st;
    int tmp=1;
    for(int i=0; i<s.size(); ++i)
    {
        if(s[i]=='(') st.push(s[i]);
        else if(s[i]==')')
        {
            if(st.size() && st.top()=='(') 
            {
                st.pop();
            }
            else 
            {
                tmp=0;
                break;
            }
        }
    }
    return tmp;
}
void next(string s)
{
    if(ok==1) return;
    for(int j=0; j<s.size(); ++j)
    {
        string res=s.substr(0, j)+s.substr(j+1, s.size()-j-1);
        if(check(res))
        {
            ok=1;
            v.push_back(res);
        }
    }
}
void solve()
{
    cin>>s;

}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    return 0;
}