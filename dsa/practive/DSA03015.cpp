#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n, s, m;
    cin>>n>>s>>m;
    if((m*s+n-1)/n<=(s-s/7)) cout<<(m*s+n-1)/n;
    else cout<<-1;
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