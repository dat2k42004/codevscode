#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> a(n), b(n-1);
    for(int i=0; i<n; ++i) cin>>a[i];
    for(int i=0; i<n-1; ++i) cin>>b[i];
    for(int i=0; i<n-1; ++i) 
    {
        if(a[i]!=b[i]) 
        {
            cout<<i+1;
            break;
        }
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