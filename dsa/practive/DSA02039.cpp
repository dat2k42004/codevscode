#include <bits/stdc++.h>

using namespace std;
int n;
vector<int> v;
vector<vector<int>> kq;

void next(int sum, int k)
{
    for(int i=k; i>=1; --i)
    {
        sum+=i;
        v.push_back(i);
        if(sum==n)
        {
            kq.push_back(v);
        }
        else if(sum<n) next(sum, i);
        sum-=i;
        v.pop_back();
    }
}
void solve()
{
    cin>>n;
    v.clear();
    kq.clear();
    next(0, n);
    cout<<kq.size()<<endl;
    for(int i=0; i<kq.size(); ++i)
    {
        cout<<'('<<kq[i][0];
        for(int j=1; j<kq[i].size(); ++j) cout<<' '<<kq[i][j];
        cout<<") ";
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