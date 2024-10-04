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
    int i=k;
    while(i>0 && v[i]>=n-k+i) i--;
    if(i==0) cout<<k;
    else 
    {
        int cnt=0, res=v[i]+1;
        if(find(v.begin(), v.end(), res)==v.end()) cnt++;
        for(int j=i+1; j<=k; ++j)
        {
            if(find(v.begin(), v.end(), res+j-i)==v.end()) cnt++;
        } 
        cout<<cnt;
    }
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