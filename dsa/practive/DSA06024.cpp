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
        int min=i;
        for(int j=i+1; j<n; ++j)
        {
            if(v[min]>v[j]) min=j;
        }
        swap(v[min], v[i]);
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