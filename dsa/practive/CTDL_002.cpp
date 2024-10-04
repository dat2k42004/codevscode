#include <iostream>
#include <vector>
using namespace std;

using ll=long long;


int v[100][100];
vector<int> a(100);
int n, k, res=1;

void sinh()
{
    for(int i=1; i<=n; i++)
    {
        //v[0][i]=0;
    }
    while(1)
    {
        int i=n;
        while(i>0 && v[res-1][i]==1) i--;
        if(i==0) break;
        v[res][i]=1;
        for(int j=i+1; j<=n; j++) v[res][j]=0;
        for(int j=1; j<i; j++) v[res][j]=v[res-1][j];
        res++;
    }
}

void solve()
{
    cin>>n>>k;
    for(int i=1; i<=n; i++) cin>>a[i];
    sinh();
    int cnt=0;
    for(int i=1; i<res; i++)
    {
        ll sum=0;
        for(int j=1; j<=n; j++)
        {
            if(v[i][j]==1) sum+=a[j];
        }
        if(sum==k)
        {
            cnt++;
            for(int j=1; j<=n; j++) if(v[i][j]==1) cout<<a[j]<<' ';
            cout<<"\n";
        }
    }
    cout<<cnt;
}

int main()
{
    solve();
    system("pause");
    return 0;
}