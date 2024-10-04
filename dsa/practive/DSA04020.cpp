#include <iostream>
#include <algorithm>
#include <vector>

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
    if(find(v.begin(), v.end(), k)!=v.end()) cout<<find(v.begin(), v.end(), k)-v.begin()+1;
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