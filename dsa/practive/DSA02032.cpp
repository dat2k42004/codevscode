#include <bits/stdc++.h>

using namespace std;
int n, k;
vector<int> v;
int a[100];
vector<vector<int>> kq;
void next(int sum, int x, int i)
{
    for(int j=i; j<=n; ++j)
    {
        sum+=v[j];
        a[x]=v[j];
        if(sum==k)
        {
            vector<int> res;
            for(int i1=1; i1<=x; ++i1) res.push_back(a[i1]);
            kq.push_back(res);
        }
        else if(sum<k)
        {
            next(sum, x+1, j);
        }
        sum-=v[j];
    }
}
void solve()
{
    cin>>n>>k;
    v.resize(n+1);
    for(int i=1; i<=n; ++i) cin>>v[i];
    sort(v.begin(), v.end());
    kq.clear();
    next(0, 1, 1);;
    if(kq.size()==0) cout<<-1;
    else
    {
        cout<<kq.size()<<' ';
        for(int i=0; i<kq.size(); ++i)
        {
            cout<<'{'<<kq[i][0];
            for(int j=1; j<kq[i].size(); ++j)
            {
                cout<<' '<<kq[i][j];
            }
            cout<<"} ";
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