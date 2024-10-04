#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(k+1);
    for(int i=1; i<=k; ++i) cin>>v[i];
    int i=0;
    while(i<=n && abs(v[i]-(n-k+i)))
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