#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int n, k;
int ok;
vector<int> v(k+1);

void assign()
{
    for(int i=1; i<=k; i++) v[i]=i;
}

void next()
{
    int i=k;
    while(i>0 && v[i]>=n-k+i) i--;
    if(i==0) ok=0;
    else
    {
        v[i]+=1;
        for(int j=i+1; j<=k; j++) v[j]=v[i]+j-i;
    }
}

void solve()
{
    cin>>n>>k;
    vector<int>a(k+1);
    for(int i=1; i<=k ;i++)
    {
        int x;
        cin>>x;
        a[i]=x;
    }
    ok=1;
    int cnt=0;
    assign();
    while(ok)
    {
        cnt++;
        int tmp=0;
        for(int i=1; i<=k; i++)
        {
            if(v[i]!=a[i])
            {
                tmp=1;
                break;
            }
        }
        if(tmp==0) break;
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