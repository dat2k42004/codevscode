#include <bits/stdc++.h>

using namespace std;
set<string> kq;
queue<string> q;
void era(string s)
{
    vector<pair<int, int>> v;
    stack<int> st;
    for(int i=0; i<s.size(); ++i)
    {
        if(s[i]=='(') st.push(i);
        else if(s[i]==')')
        {
            v.push_back({st.top(), i});
            st.pop();
        }
    }
    for(auto x: v)
    {
        string f=s;
        f.erase(x.first, 1);
        f.erase(x.second-1, 1);
        if(kq.count(f)==0)
        {
            kq.insert(f);
            q.push(f);
        }
    }
}
void solve()
{
    string s;
    cin>>s;
    q.push(s);
    while(!q.empty())
    {
        string r=q.front();
        q.pop();
        era(r);
    }
    for(auto x: kq) cout<<x<<'\n';
}
int main()
{
    solve();
    return 0;
}