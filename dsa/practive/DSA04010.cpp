#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    int tmp=v[0], res=v[0];
    for(int i=1; i<n; ++i)
    {
        if(tmp<0)
        {
            tmp=v[i];
        }
        else 
        {
            tmp+=v[i];
        }
        res=max(res, tmp);
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