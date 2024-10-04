#include <iostream>
#include <string.h>
#include <algorithm>
#include <vector>


using namespace std;
void solve()
{
    string s, r="";
    cin>>s;
    r=s[0];
    for(int i=1; i<s.size(); ++i)
    {
        int n=r.size()-1;
        if(r[n]!=s[i]) r+="1";
        else r+="0";
    }
    cout<<r<<endl;
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