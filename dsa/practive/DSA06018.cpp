#include <iostream>
#include <set>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    set<int> s;
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
        s.insert(v[i]);
    }
    sort(v.begin(), v.end());
    cout<<v[n-1]-v[0]+1-s.size();
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