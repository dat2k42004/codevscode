#include <iostream>
#include <algorithm>
#include <vector>
#include <cmath>

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
    int x, y;
    vector<pair<int, int>> v;
    for(int i=0; i<n; ++i)
    {
        cin>>x>>y;
        v.push_back({x, y});
    }
    sort(v.begin(), v.end(), cmp);
    int res=1, i=0;
    for(int j=1; j<n; ++j)
    {
        if(v[j].first>=v[i].second) 
        {
            res++;
            i=j;
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