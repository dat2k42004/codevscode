#include <iostream>
#define ll long long
using namespace std;
void solve()
{
    ll t, m;
    cin>>t>>m;
    while(1)
    {
        if(m%t==0) 
        {
            cout<<"1/"<<m/t;
            break;
        }
        else
        {
            ll res=m/t+1;
            cout<<"1/"<<res<<" + ";
            t=t*res-m;
            m=m*res;
        }
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
    return 0;
}