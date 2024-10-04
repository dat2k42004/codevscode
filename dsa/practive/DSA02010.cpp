#include <bits/stdc++.h>

using namespace std;
int n, x;
int a[101], c[21];
vector<vector<int>> v;
void next(int k, int i, int s)
{
    for(int j=i; j<=n; ++j)
    {
        s+=c[j];
        a[k]=c[j];
        if(s==x)
        {
            vector<int> res;
            for(int ij=1; ij<=k; ++ij)
            {
                res.push_back(a[ij]);
            }
            v.push_back(res);
        }
        else if(s<x)
        {
            next(k+1, j, s);
        }
        s-=c[j];
    }
}
void solve()
{
    v.clear();
    cin>>n>>x;
    for(int i=1; i<=n; ++i) cin>>c[i];
    sort(c+1, c+n+1);
    next(1, 1, 0);
    if(v.size()==0)
    {
        cout<<-1;
    }
    else
    {
        for(int i=0; i<v.size(); ++i)
        {
            cout<<"["<<v[i][0];
            for(int j=1; j<v[i].size(); ++j)
            {
                cout<<' '<<v[i][j];
            }
            cout<<"]";
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