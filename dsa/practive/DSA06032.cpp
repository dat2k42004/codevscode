#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    long long  n, k;
    cin>>n>>k;
    vector<long long> v(n);
    for(int i=0; i<n; ++i)
        cin>>v[i];
    sort(v.begin(), v.end());
    long long cnt=0;
    for(int i=0; i<n; ++i)
    {
        if(v[i]>=k) 
            break;
        for(int j=i+1; j<n; j++)
        {
            auto it=lower_bound(v.begin()+j+1, v.end(), k-v[i]-v[j]);
            cnt+=(it-(v.begin()+j+1));
        }
    }
    cout<<cnt<<endl;
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