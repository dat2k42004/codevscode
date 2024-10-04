#include <iostream>
#include <algorithm>
#include <cmath>

using namespace std;
string a[101];
string add(string a, string b)
{
    if(a.size()>b.size()) swap(a, b);
    int n=b.size();
    for(int i=0; i<n-a.size(); ++i) a="0"+a;
    string s="";
    int res=0;
    for(int i=n-1; i>=0; --i)
    {
        int tmp=res+a[i]-'0'+b[i]-'0';
        s=to_string(tmp%10)+s;
        res=tmp/10;
    }
    if(res>=1) s=to_string(res)+s;
    return s;
}
string mul(string a, string b)
{
    int n1=a.size(), n2=b.size();
    
}
void setup()
{
    a[0]=a[1]="1";
    for(int i=2; i<=100; ++i)
    {
        a[i]="0";
        for(int j=0; j<i; ++j) a[i]+=add(a[i], mul(a[j], a[i-j]));
    }
}   
void solve()
{
    int n;
    cin>>n;
    cout<<a[n];
    cout<<endl;
}
int main()
{
    setup();
    int t;
    cin>>t;
    setup();
    while(t--)
    {
        solve();
    }
    return 0;
}