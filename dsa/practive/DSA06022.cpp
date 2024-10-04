#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; i++) cin>>v[i];
    sort(v.begin(), v.end());
    int i=1;
    while(i<n && v[i]==v[i-1])
    {
        i++;
    }
    if(i==n) cout<<-1;
    else cout<<v[0]<<' '<<v[i];
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