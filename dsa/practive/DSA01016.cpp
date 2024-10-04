#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
int x[10000];
int n, ok=0;
void next(int sum, int i)
{
    if(sum==n)
    {
        for(int j=0; j<i-1; ++j)
        {
            if(x[j]<x[j+1]) ok=1;
        }
        if(ok==0)
        {
            cout<<"(";
            for(int j=0; j<i; ++j)
            {
                cout<<x[j];
                if(j==i-1) cout<<") ";
                else cout<<' ';
            }
            return;
        }
    }
    ok=0;
    for(int j=n; j>=1; --j)
    {
        if(sum+j<=n) 
        {
            x[i]=j;
            next(sum+j, i+1);
        }
    }
}
void solve()
{
    cin>>n;
    ok=0;
    next(0, 0);
    cout<<"\n";
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    return 0;
}