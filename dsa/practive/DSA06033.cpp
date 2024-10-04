#include <bits/stdc++.h>

using namespace std;
bool cmp(pair<int, int> a, pair<int, int> b)
{
    return a.first<b.first;
}
void solve()
{
    int n;
    cin>>n;
    vector<pair<int, int>> v;
    for(int i=0; i<n; ++i)
    {
        int x;
        cin>>x;
        v.push_back({x, i});
    }
    sort(v.begin(), v.end(), cmp);
    int last=v[0].second;
    int res=-1e9;
    for(int i=1; i<n; ++i)
    {
        if(res<v[i].second-last) res=v[i].second-last;
        last=min(last, v[i].second);
    }
    cout<<res<<endl;
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