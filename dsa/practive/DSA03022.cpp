#include <iostream> 
#include <algorithm>
#include <vector>
#include <map>
#include <cstring>
#include <cmath>
#include <set>
#include <stack>
#include <queue>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<long long> v(n), a;
    for(int i=0; i<n; ++i) 
    {
        cin>>v[i];
        if(v[i]) a.push_back(v[i]);
    }
    sort(a.begin(), a.end());
    long long res=max(a[0]*a[1], max(a[0]*a[1]*a[a.size()-1], max(a[a.size()-1]*a[a.size()-2], a[a.size()-1]*a[a.size()-2]*a[a.size()-3])));
    if(res>0) cout<<res;
    else cout<<0;
    cout<<endl;
}
int main()
{
    solve();
    system("pause");
    return 0;
}