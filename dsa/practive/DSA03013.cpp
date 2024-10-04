#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>
#include <map>
using namespace std;
void solve()
{
    int k;
    cin>>k;
    string s;
    cin>>s;
    map<char, int> m;
    for(int i=0; i<s.size(); ++i)
    {
        m[s[i]]++;
    }
    int res=0;;
    for(auto x: m)
    {
        res=max(res, x.second);
    }
    if(res*k>s.size()+1) cout<<-1;
    else cout<<1;
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