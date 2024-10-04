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
    for(int i=0; i<n-1; ++i)
    {
        int res=0;
        for(int j=0; j<n-i-1; ++j)
        {
            if(v[j+1]<v[j])
            {
                swap(v[j+1], v[j]);
                res=1;
            }
        }
        if(res==0) break;
        cout<<"Buoc "<<i+1<<": ";
        for(int j=0; j<n; ++j) cout<<v[j]<<' ';
        cout<<endl;
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}