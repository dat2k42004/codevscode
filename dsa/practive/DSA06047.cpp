#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<long long> v(n);
    for(int i=0; i<n; ++i) 
    {
        cin>>v[i];
        v[i]*=v[i];
    }
    sort(v.begin(), v.end());
    int res=0;
    for(int i=2; i<n; ++i)
    {
        int l=0, r=i-1;
        while(l<r)
        {
            if(v[l]+v[r]==v[i]) 
            {
                res=1;
                break;
            }
            else if(v[l]+v[r]>v[i]) r--;
            else l++;
        }
        if(res==1) break;
    }
    if(res==1) cout<<"YES";
    else cout<<"NO";
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