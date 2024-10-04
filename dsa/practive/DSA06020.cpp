#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(n);
    for(int i=0; i<n; ++i) 
    {
        cin>>v[i];
    }
    if(find(v.begin(), v.end(), k)!=v.end()) cout<<1;
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