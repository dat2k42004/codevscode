#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    sort(v.begin(), v.end());
    int m=n/2;
    int i=m-1, j=n-1;
    int res=0;
    while(i>=0)
    {
        if(v[j]>=2*v[i])
        {
            res++;
            i--;
            j--;
        }
        else i--;
    } 
    cout<<n-res<<endl;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    return 0;
}