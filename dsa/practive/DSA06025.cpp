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
    for(int i=0; i<n; ++i)
    {
        int k=v[i];
        int j=i-1;
        while(j>=0 && v[j]>k)
        {
            v[j+1]=v[j];
            j=j-1;
        }
        v[j+1]=k;
        cout<<"Buoc "<<i<<": ";
        for(j=0; j<=i; ++j) cout<<v[j]<<' ';
        cout<<endl;
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}