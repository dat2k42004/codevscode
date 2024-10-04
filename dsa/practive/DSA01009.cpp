#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
int n, k, res=0;
string x, y;
vector<string> a;
vector<int> v(n+1);
void result()
{
    string s="";
    for(int i=1; i<=n; ++i)
    {
        if(v[i]==0) s+="A";
        else s+="B";
    }
    if(s.find(x)!=-1 && s.find(y)==-1)
    {
        res++;
        a.push_back(s);
    }
}
void tri(int i)
{
    for(int j=0; j<=1; ++j)
    {
        v[i]=j;
        if(i==n) result();
        else tri(i+1);
    }
}
void solve()
{
    cin>>n>>k;
    x="";
    y="";
    for(int i=0; i<k; ++i) x+="A";
    y+=(x+"A");
    tri(1);
    cout<<res<<endl;
    for(string s: a) cout<<s<<endl;
}
int main()
{
    solve();
    system("pause");
    return 0;
}