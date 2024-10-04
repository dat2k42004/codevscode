#include <iostream>
#include <vector>
#include <algorithm>
#include <math.h>

using namespace std;

int n, k, ok;
vector<int> v;

void assign()
{
    v.clear();
    for(int i=0; i<n; i++) v.push_back(0);
}

void next()
{
    int i=n-1;
    while(i>-1 && v[i]==1)
    {
        v[i]=0;
        i--;
    }
    if(i==-1) ok=0;
    else v[i]=1;
}

bool check()
{
    int res=0;
    for(int i=0; i<n; i++)
    {
        res+=v[i];
    }
    return res == k;
}

void solve()
{
    cin>>n>>k;
    assign();
    ok=1;
    while(ok)
    {
        if(check())
        {
            for(int x: v) cout<<x;
            cout<<endl;
        }
        next();
    }
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