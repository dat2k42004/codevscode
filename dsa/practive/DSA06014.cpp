#include <iostream>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

vector<int> v(1e6+1);

void seive()
{
    for(int i=0; i<1e6; i++) v[i]=1;
    v[0]=v[1]=0;
    for(int i=2; i<1e3; ++i)
    {
        for(int j=i*i; j<1e6; j+=i) v[j]=0;
    }
}


void solve()
{
    int n;
    cin>>n;
    seive();
    int res=0;
    for(int i=2; i<=n-2; ++i)
    {
        if(v[i]==1 && v[n-i]==1)
        {
            cout<<i<<' '<<n-i;
            res=1;
            break;
        }
    }
    if(res==0) cout<<-1;
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