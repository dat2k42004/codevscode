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
    long long sum1=0, sum2=0;
    sort(v.begin(), v.end());
    for(int i=0; i<n; ++i)
    {
        if(i%2==0)
        {
            sum1=sum1*10+v[i];
        }
        else sum2=sum2*10+v[i];
    }
    cout<<sum1+sum2<<endl;
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