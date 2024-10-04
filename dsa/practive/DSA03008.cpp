#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool cmp(pair<int, int> a, pair<int, int> b)
{
    if(a.second==b.second) return a.first<b.first;
    return a.second<b.second;
}


void solve()
{
    int n;
    cin>>n;
    vector<int> s(n), f(n);
    for(int i=0; i<n; ++i)
        cin>>s[i];
    for(int i=0; i<n; ++i) 
        cin>>f[i];
    vector<pair<int, int>> v;
    for(int i=0; i<n; ++i)
    {
        v.push_back({s[i], f[i]});
    }
    sort(v.begin(), v.end(), cmp);
    int res=1, i=0;
    for(int j=1; j<n; ++j)
    {
        if(v[j].first>=v[i].second)
        {
            i=j;
            res++;
        }
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