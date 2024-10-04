#include <iostream>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;
bool cmp(int a, int b)
{
    return a>b;
}

void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    sort(v.begin(), v.end(), cmp);
    for(int i=0; i<k; ++i) cout<<v[i]<<' ';
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
    system("pause");
    return 0;
}