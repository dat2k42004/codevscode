#include <iostream>
#include <algorithm>
#include <cmath>
#include <vector>
#define ll long long 
using namespace std;
ll find(ll n, ll k)
{
    ll res=pow(2, n)-1;
    if(k==res/2+1) return n;
    else if(k>res/2+1) return find(n-1, k-(res/2+1));
    else return find(n-1, k);
}
void solve()
{
    ll n, k;
    cin>>n>>k;
    cout<<find(n, k)<<endl;
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