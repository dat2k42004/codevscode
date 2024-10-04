#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int k;
    string a, b;
    cin>>k>>a>>b;
    string s="";
    while(a.size()>b.size()) swap(a, b);
    int n=b.size();
    for(int i=a.size(); i<n; ++i) a="0"+a;
    int res=0;
    for(int i=n-1; i>=0; --i)
    {
        int tmp=res+a[i]-'0'+b[i]-'0';
        s=to_string(tmp%k)+s;
        res=tmp/k;
    }
    if(res>0) s=to_string(res)+s;
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
    return 0;
}