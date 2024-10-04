#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    int res=0;
    for(int i=0; i<n-1; ++i)
    {
        for(int j=i+1; j<n; ++j) 
        {
            if(v[j]+v[i]==k) res++;
        }
    }
    cout<<res<<endl;
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