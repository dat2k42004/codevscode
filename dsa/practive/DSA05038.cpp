#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<pair<int, int>> v(n);
    for(int i=0; i<n; ++i)
    {
        cin>>v[i].first>>v[i].second;
    }
    vector<int> a(n, 1);
    int res=1;
    for(int i=1; i<n; ++i)
    {
        for(int j=0; j<i; ++j)
        {
            if(v[i].first>v[j].first && v[i].second>v[j].second)
            {
                a[i]=max(a[i], a[j]+1);
            }
        }
        res=max(a[i], res);
    }
    cout<<res<<endl;
}
int main()
{
    solve();
    return 0;
}
