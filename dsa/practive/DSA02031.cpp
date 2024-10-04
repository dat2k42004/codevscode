#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
int n, u[10];
vector<int> a(10);
void result()
{
    string s="";
    for(int i=1; i<=n; ++i)
    {
        s+=(char)(a[i]+64);
    }
    if(s.size()<5)
    {
        if(s[0]=='A' || s[s.size()-1]=='A') cout<<s<<endl;
    }
    else 
    {
        if((s[0]=='A' && s[s.size()-1]=='E') || (s[0]=='E' && s[s.size()-1]=='A') || s.find("AE")!=-1 || s.find("EA")!=-1) cout<<s<<endl;
    }
    return;
}
void next(int i)
{
    for(int j=1; j<=n; ++j)
    {
        if(u[j]==0)
        {
            a[i]=j;
            u[j]=1;
            if(i==n) result();
            else next(i+1);
            u[j]=0;
        }
    }
}
void solve()
{
    char x;
    cin>>x;
    n=x-'A'+1;
    next(1);
}
int main()
{
    solve();
    system("pause");
    return 0;
}
