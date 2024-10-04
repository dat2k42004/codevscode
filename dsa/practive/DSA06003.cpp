#include <iostream>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;


void solve()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0; i<n; ++i)
    {
        cin>>a[i];
    }
    int cnt=0;
    for(int i=0; i<n-1; ++i)
    {
        int k=i;
        for(int j=i+1; j<n; ++j)
        {
            if(a[j]<a[k]) k=j;
        }
        if(k!=i) cnt++;
        swap(a[i], a[k]);
    }
    cout<<cnt;
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