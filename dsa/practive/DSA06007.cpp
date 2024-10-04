#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    int n;
    cin>>n;
    vector<int> v(n), kq;
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
        kq.push_back(v[i]);
    }
    sort(kq.begin(), kq.end());
    int l=0, r=n-1;
    while(l<n && kq[l]==v[l]) l++;
    while(r>=0 && kq[r]==v[r]) r--;
    cout<<l+1<<' '<<r+1<<endl;
    //for(int x: kq) cout<<x<<' '<<endl;
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