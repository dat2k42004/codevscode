#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;
int n, ok;
vector<int> v(n+1);

void assign()
{
    for(int i=1; i<=n; i++)
    {
        v[i]=i;
    }
}

void next()
{
    int i=n-1;
    while(i>0 && v[i]>v[i+1]) i--;
    if(i==0) ok=0;
    else 
    {
        int k=n;
        while(k>i && v[k]<v[i]) k--;
        swap(v[k], v[i]);
        int l=i+1, r=n;
        while(l<r) 
        {
            swap(v[l], v[r]);
            l++;
            r--;
        }
    }

}

void solve()
{
    cin>>n;
    int a[n+1];
    for(int i=1; i<=n; i++) cin>>a[i];
    ok=1;
    int cnt=0;
    assign();
    while(ok)
    {
        cnt++;
        int res=0;
        for(int i=1; i<=n; i++)
        {
            if(v[i]!=a[i]) 
            {
                res=1;
                break;
            }
        }
        if(res==0) break;
        else next();
    }
    cout<<cnt<<endl;
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