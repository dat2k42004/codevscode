#include <iostream>
#include <cmath>




using namespace std;
int mod=1e9+7;
int n, k;

int res[1001][1001];

void setup()
{
    for(int i=1; i<=1000; ++i)
    {
        for(int j=1; j<=1000; ++j) res[i][j]=0;
    }
    for(int i=1; i<=1000; i++) 
    {
        res[i][1]=i%mod;
        res[i][i]=1;
    }
    for(int i=3; i<=1000; ++i)
    {
        for(int j=2; j<i; ++j)
        {
            res[i][j]=(res[i-1][j-1]+res[i-1][j])%mod;
        }
    }

}
void solve()
{
    cin>>n>>k;
    cout<<res[n][k]<<endl;
}


int main()
{
    int t;
    cin>>t;
    setup();
    while(t--)
    {
        solve();
    }
    system("pause");
    return 0;
}