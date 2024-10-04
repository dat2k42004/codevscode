#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
vector<long long> f(100);
void fibo()
{
    f[1]=1;
    f[2]=1;
    for(int i=3; i<93; ++i)
    {
        f[i]=f[i-1]+f[i-2];
    }
}
int find(long long n, long long k)
{
    if(n==1) return 0;
    else if(n==2)
    {
        return 1;
    }
    else if(k>f[n-2]) return find(n-1, k-f[n-2]);
    else return find(n-2, k); 
}
void solve()
{
    long long n, k;
    cin>>n>>k;
    fibo();
    cout<<find(n, k);
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