#include <bits/stdc++.h>

using namespace std;
int ok;

void next(int i, vector<int> m, int n, string s)
{
    if(ok==1) return;
    for(int j=0; j<10; ++j)
    {
        m.push_back(j);
        if(i==n)
        {
            int res=0;
            string x=s;
            for(int k=0; k<s.length(); ++k)
            {
                if(k!=3)
                {
                    if(x[k]=='?')
                    {
                        x[k]=m[res++]+'0';
                    }
                }
            }
            if(x[0]!='0' && x[5]!='0' && x[10]!='0')
            {
                int a=stoi(x.substr(0, 2));
                int b=stoi(x.substr(5, 2));
                int c=stoi(x.substr(10, 2));
                if(x[3]=='+') 
                {
                    if(a+b==c)
                    {
                        ok=1;
                        cout<<x;
                        return;
                    }
                }
                else if(x[3]=='-')
                {
                    if(a-b==c)
                    {
                        ok=1;
                        cout<<x;
                        return;
                    }
                }
                else if(x[3]=='?')
                {
                    if(a+b==c) 
                    {
                        x[3]='+';
                        cout<<x;
                        ok=1;
                        return;
                    }
                    else if(a-b==c)
                    {
                        x[3]='-';
                        cout<<x;
                        ok=1;
                        return;
                    }
                }
            }
        }
        if(i<n)
        {
            next(i+1, m, n, s);
        }
        m.pop_back();

    }
}
void solve()
{
    string s;
    getline(cin, s);
    int n=0;
    for(int i=0; i<s.size(); ++i)
    {
        if(s[i]=='?' && i!=3) n++;
    }
    ok=0;
    vector<int> m;
    next(0, m, n, s);
    if(ok==0) cout<<"WRONG PROBLEM!";
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