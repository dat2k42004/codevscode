#include <iostream>
#include <vector>
#include <map>
#include <cstring>
#include <algorithm>


using namespace std;
void solve()
{
    string s;
    cin>>s;
    map<char, int> m;
    for(int i=0; i<s.size(); ++i) 
    {
        m[s[i]]++;
    }
    int res=0;
    for(auto x: m)
    {
        res=max(res, x.second);
    }
    int n=s.size();
    if((n%2==0 && res>n/2) || (n%2==1 && res>n/2+1)) cout<<-1;
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