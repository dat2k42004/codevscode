#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void solve()
{
    int n;
    cin>>n;
    vector<int> v;
    for(int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    sort(v.begin(), v.end());
    int l=0, r=n-1;
    while(l<r)
    {
        cout<<v[r]<<' '<<v[l]<<' ';
        l++, r--;
    }
    if(n%2!=0) cout<<v[n/2];
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