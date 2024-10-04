#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(n);
    int res=0;
    for(int i=0; i<n; ++i) 
    {
        cin>>v[i];
        if(v[i]==k) res++;
    }
    if(res>0) cout<<res;
    else cout<<-1;
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