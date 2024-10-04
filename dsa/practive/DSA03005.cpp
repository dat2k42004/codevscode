#include <iostream>
#include <vector> 
#include <algorithm>

using namespace std;
void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(n);
    int sum=0;
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
        sum+=v[i];
    }
    sort(v.begin(), v.end());
    int res=0;
    for(int i=0; i<(min(n-k, k)); ++i)
    {
        res+=v[i];
    } 
    cout<<sum-2*res<<endl;
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