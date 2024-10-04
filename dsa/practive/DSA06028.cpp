#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    int a[100][100];
    for(int i=0; i<n; ++i) cin>>v[i];
    int m=1;
    for(int i=0; i<n-1; ++i)
    {
        int min=i;
        for(int j=i+1; j<n; ++j)
        {
            if(v[j]<v[min]) min=j;
        }
        swap(v[min], v[i]);
        for(int j=0; j<n; ++j)
        {
            a[m][j]=v[j];
        }
        m++;
    }
    for(int i=m-1; i>=1; --i)
    {
        cout<<"Buoc "<<i<<": ";
        for(int j=0; j<n; ++j) cout<<a[i][j]<<' ';
        cout<<endl;
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}