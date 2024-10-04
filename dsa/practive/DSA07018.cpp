#include <iostream>
#include <algorithm>
#include <stack>
#include <vector>

using namespace std;
void solve()
{
    string s1, s2;
    getline(cin, s1);
    getline(cin, s2);
    s1="+ "+s1;
    s2="+ "+s2;
    int x, y;
    stack<char> st;
    vector<pair<int, int>> v1, v2;
    for(int i=s1.size()-1; i>=0; --i)
    {
        if(s1[i]>='0' && s1[i]<='9') st.push(s1[i]);
        else if(s1[i]=='^')
        {
            y=0;
            while(st.size())
            {
                y=y*10+st.top()-'0';
                st.pop();
            }
        }
        else if(s1[i]==' ' && s1[i-1]=='+')
        {
            x=0;
            while(st.size())
            {
                x=x*10+st.top()-'0';
                st.pop();
            }
            v1.push_back({x, y});
        }
    }
    while(st.size()) st.pop();
    for(int i=s2.size()-1; i>=0; --i)
    {
        if(s2[i]>='0' && s2[i]<='9') st.push(s2[i]);
        else if(s2[i]=='^')
        {
            y=0;
            while(st.size())
            {
                y=y*10+st.top()-'0';
                st.pop();
            }
        }
        else if(s2[i]==' ' && s2[i-1]=='+')
        {
            x=0;
            while(st.size())
            {
                x=x*10+st.top()-'0';
                st.pop();
            }
            v2.push_back({x, y});
        }
    }
    int i=v1.size()-1, j=v2.size()-1;
    while(1)
    {
        if(i>=0 && j>=0 && v1[i].second==v2[j].second)
        {
            if(i!=v1.size()-1 ||  j!=v2.size()-1) cout<<" + ";
            cout<<v1[i].first+v2[j].first<<"*x^"<<v1[i].second;
            i--;
            j--;
        }
        if(i>=0 && v1[i].second>v2[j].second)
        {
            if(i!=v1.size()-1 || j!=v2.size()-1) cout<<" + ";
            cout<<v1[i].first<<"*x^"<<v1[i].second;
            i--;
        }
        if(j>=0 && v1[i].second<v2[j].second)
        {
            if(i!=v1.size()-1 || j!=v2.size()-1) cout<<" + ";
            cout<<v2[j].first<<"*x^"<<v2[j].second;
            j--;
        }
        if(i==-1 && j==-1) break;
    }
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
    return 0;
}