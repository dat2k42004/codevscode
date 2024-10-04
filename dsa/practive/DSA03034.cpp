#include <iostream>
#include <vector>
#include <algorithm>


using namespace std;
void solve()
{
    int n, m, k;
    cin>>n>>m>>k;
    vector<int> a(n), b(m), c(k);
    for(int i=0; i<n; ++i) cin>>a[i];
    for(int i=0; i<m; ++i) cin>>b[i];
    for(int i=0; i<k; ++i) cin>>c[i];
    vector<int> v, kq;
    int i=0, j=0;
    while(i<n && j<m)
    {
        if(a[i]==b[j])
        {
            v.push_back(a[i]);
            i++;
            j++;
        }
        else if(a[i]<b[j]) i++;
        else j++;
    }
    int h=v.size();
    i=0, j=0;
    while(i<h && j<k)
    {
        if(v[i]==c[j]) 
        {
            kq.push_back(v[i]);
            i++;
            j++;
        }
        else if(v[i]<c[j]) i++;
        else j++;
    }
    if(kq.size()==0) cout<<"NO";
    else for(i=0; i<kq.size(); ++i) cout<<kq[i]<<' ';
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