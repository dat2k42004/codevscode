#include <iostream>
#include <algorithm>
#include <vector>
#include <set>

using namespace std;
string find(vector<int> &a, int n, int k)
{
    set<int> s;
    for(int i=0; i<n-1; ++i)
    {
        for(int j=i+1; j<n; ++j)
        {
            int sum=a[i]+a[j];
            if(s.find(k-sum)!=s.end()) return "YES";
        }
        s.insert(a[i]);
    }
    return "NO";
}
void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    cout<<find(v, n, k)<<endl;
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