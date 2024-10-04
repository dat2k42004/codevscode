#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n;
vector<int> v(12);
int a[12]={0};
void result()
{
    int res=0;
    for(int i=1; i<n; ++i)
    {
        if(abs(v[i]-v[i+1])==1) 
        {
            res=1;
            break;
        }
    }
    if(res==1) return;
    else 
    {
        for(int i=1; i<=n; ++i) cout<<v[i];
        cout<<endl;
    }
}
void next(int i)
{
    for(int j=1; j<=n; ++j)
    {
        if(a[j]==0) 
        {
            v[i]=j;
            a[j]=1;
            if(i==n)
            {
                result();
            }
            else next(i+1);
            a[j]=0;
        }
    }
}
void solve()
{
    cin>>n;
    next(1);
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