#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    string s;
    cin>>s;
    int i=s.size()-1;
    while(i>-1 && s[i]=='0') i--;
    if(i==-1) 
    {
        for(int j=0; j<s.size(); j++) s[j]='1';
    }
    else
    {
        s[i]='0';
        for(int j=i+1; j<s.size(); j++) s[j]='1';
    }
    cout<<s<<endl;
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