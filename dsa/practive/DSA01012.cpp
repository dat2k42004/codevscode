#include <bits/stdc++.h>

using namespace std;

int gray(int n)
{
    return n^(n>>1);
}
void solve()
{
    int n;
    cin>>n;
    for(int i=0; i<(1<<n); ++i)
    {
        bitset<32> r(gray(i));
        string s=r.to_string();
        cout<<s.substr(32-n)<<' ';
    }
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