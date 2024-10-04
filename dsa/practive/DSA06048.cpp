#include <iostream>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0; i<n; ++i) cin>>a[i];
    int res=*min_element(a, a+n);
    for(int i=n-1; i>=0; --i)
    {
        if(a[i]==res)
        {
            cout<<i<<endl;
            break;
        }
    }
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