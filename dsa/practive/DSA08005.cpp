#include <iostream>
#include <queue>
#include <vector>

using namespace std;
string chance(int n)
{
    string s="";
    while(n)
    {
        if(n%2==0) s="0"+s;
        else s="1"+s;
        n/=2;
    }
    return s;
}
void solve()
{
    int n;
    cin>>n;
    for(int i=1; i<=n; ++i) cout<<chance(i)<<' ';
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