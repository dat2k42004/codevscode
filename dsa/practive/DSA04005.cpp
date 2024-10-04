#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#define ll long long
using namespace std;
vector<ll> v(93);
void setup()
{
    v[1]=1;
    v[2]=1;
    for(int i=3; i<93; i++)
    {
        v[i]=v[i-1]+v[i-2];
    }
}
char find(ll n, ll k)
{
    if(n==1) return 'A';
    else if(n==2) return 'B';
    else if(k>v[n-2]) return find(n-1, k-v[n-2]);
    else return find(n-2, k);
}
void solve()
{
    ll n, k;
    cin>>n>>k;
    setup();
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