#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    int res=-1;
    for(int i=0; i<n-1; ++i)
    {
        for(int j=i+1; j<n; ++j)
        {
            if(v[j]==v[i])
            {
                res=v[i];
                break;
            }
        }
        if(res!=-1) break;
    }    
    if(res==-1) cout<<"NO";
    else cout<<res;
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