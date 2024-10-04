#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    vector<int> a[100];
    for(int i=0; i<n; ++i) cin>>v[i];
    int m=0;
    for(int i=0; i<n; ++i)
    {
        int res=v[i];
        int j=i-1;
        while(j>=0 && v[j]>res)
        {
            v[j+1]=v[j];
            j-=1;
        }
        v[j+1]=res;
        for(j=0; j<=i; ++j)
        {
            a[m].push_back(v[j]);
        }
        m++;
    }
    for(int i=m-1; i>=0; --i)
    {
        cout<<"Buoc "<<i<<": ";
        for(int x: a[i]) cout<<x<<' ';
        cout<<endl;
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}