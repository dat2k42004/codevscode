#include <iostream>
#include <algorithm>
#include <cmath>
#include <vector>

using namespace std;
int find(vector<int> a, vector<int> b, int n, int m, int k)
{
    vector<int> v;
    int i=0, j=0;
    while(i<n && j<m)
    {
        if(a[i]<=b[j]) 
        {
            v.push_back(a[i]);
            i++;
        }
        else 
        {
            v.push_back(b[j]);
            j++;
        }
        if(v.size()==k) 
        {
            return v[k-1];
            break;
        }
    }
}
void solve()
{
    int n, m, k;
    cin>>n>>m>>k;
    vector<int> a(n), b(m);
    for(int i=0; i<n; ++i) cin>>a[i];
    for(int i=0; i<m; ++i) cin>>b[i];
    cout<<find(a, b, n, m, k)<<endl;
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