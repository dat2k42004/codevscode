#include <iostream>
#include <algorithm>
#include <vector>
#include <cmath>
#define ll long long
using namespace std;
char find(int n, ll k)
{
    ll res=pow(2, n)-1;
    if(k==res/2+1) return (char)(64+n);
    else if(k>res/2+1) return find(n-1, k-res/2-1);
    else return find(n-1, k); 
}
void solve()
{
    ll n, k;
    cin>>n>>k;
    cout<<find(n , k)<<endl;
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