#include <iostream>
#include <vector>
#include <set>
#include <algorithm>


using namespace std;



void solve()
{
    int n, k;
    cin>>n>>k;
    int a[n];
    vector<pair<int, int>> v(n);
    for(int i=0; i<n; ++i) 
    {
        cin>>a[i];
        v[i].first=abs(k-a[i]);
        v[i].second=i;
    }
    sort(v.begin(), v.end());
    for(int i=0; i<n; ++i) cout<<a[v[i].second]<<' ';
    cout<<endl;
}


int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    system("pause");
    return 0;
}