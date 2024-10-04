#include <iostream>
#include <vector>
#define ll long long
using namespace std;
ll merge(ll a[], int l, int m, int r)
{
    int n1=m-l+1;
    int n2=r-m;
    ll L[n1], R[n2];
    for(int i=0; i<n1; ++i) L[i]=a[l+i];
    for(int i=0; i<n2; ++i) R[i]=a[i+m+1];
    int i=0, j=0, k=l;
    ll res=0;
    while(i<n1 && j<n2)
    {
        if(L[i]<=R[j])
        {
            a[k++]=L[i++];
        }
        else 
        {
            a[k]=R[j];
            j++;
            k++;
            res+=n1-i;
        }
    }
    while(i<n1) a[k++]=L[i++];
    while(j<n2) a[k++]=R[j++];
    return res;
}
ll mergesort(ll a[], int l, int r)
{
    ll res=0;
    if(l<r)
    {
        int m=(r+l)/2;
        res+=mergesort(a, l, m);
        res+=mergesort(a, m+1, r);
        res+=merge(a, l, m, r);
    }
    return res;
}
void solve()
{
    int n;
    cin>>n;
    ll a[n];
    for(int i=0; i<n; ++i) cin>>a[i];
    cout<<mergesort(a, 0, n-1)<<endl;
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    return 0;
}
