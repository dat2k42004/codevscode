#include <iostream>
#include <vector>
#include <set>
#include <algorithm>
#include <string.h>
using namespace std;

vector<string> v;


int n, m, k;
int x[100];


void result()
{
    for(int i=1; i<=k; ++i)
    {
        cout<<v[x[i]-1]<<' ';
    }
    cout<<endl;
}

void next(int i)
{
    for(int j=x[i-1]+1; j<=m-k+i; ++j)
    {
        x[i]=j;
        if(i==k) result();
        else next(i+1);
    }
}

void solve()
{
    cin>>n>>k;
    string x;
    set<string> s;
    for(int i=0; i<n; ++i)
    {
        cin>>x;
        s.insert(x);
    }
    for(auto x: s) v.push_back(x);
    m=v.size();
    x[0]=0;
    next(1);
}

int main()
{
    solve();
    system("pause");
    return 0;
}