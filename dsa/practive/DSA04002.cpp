#include <iostream>
#include <cstring>
#include <cmath>
#include <algorithm>

using namespace std;
const long long mod=1e9+7;
string reverse1(string a)
{
    reverse(a.begin(), a.end());
    return a;
}
long long exponential(long long a, long long b)
{
    if(b==1) return a%mod;
    long long half=exponential(a, b/2);
    if(b%2==0) return (half*half)%mod;
    else return (((half*half)%mod)*a)%mod;
}

void solve()
{
    string a;
    cin>>a;
    string b=reverse1(a);
    long long n=stoll(a), r=stoll(b);
    cout<<exponential(n, r);
    //cout<<a<<b;
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