#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>

using namespace std;
int sum1(string a, string b)
{
    for(int i=0; i<a.size(); ++i) 
    {
        if(a[i]=='5') a[i]='6';
    }
    for(int i=0; i<b.size(); ++i) 
    {
        if(b[i]=='5') b[i]='6';
    }
    return stoi(a)+stoi(b);
}
int sum2(string a, string b)
{
    for(int i=0; i<a.size(); ++i) 
    {
        if(a[i]=='6') a[i]='5';
    }
    for(int i=0; i<b.size(); ++i) 
    {
        if(b[i]=='6') b[i]='5';
    }
    return stoi(a)+stoi(b);
}
void solve()
{
    string s1, s2;
    cin>>s1>>s2;
    cout<<sum2(s1, s2)<<' '<<sum1(s1, s2);
}
int main()
{
    solve();
    system("pause");
    return 0;
}