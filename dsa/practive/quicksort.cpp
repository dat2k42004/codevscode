#include <iostream>
#include <algorithm>

using namespace std;

int partition(int a[], int low, int high)
{
    int p=a[high];
    int l=low;
    int r=high-1;
    while(1)
    {
        while(l<=r && a[l]<p) l++;
        while(r>=l && a[r]>p) r--;
        if(l>=r) break;
        swap(a[l], a[r]);
        l++;
        r--;
    }
    swap(a[l], a[high]);
    return l;
}

void quicksort(int a[], int low, int high)
{
    if(low<high)
    {
        int pi=partition(a, low, high);
        quicksort(a, low, pi-1);
        quicksort(a, pi+1, high);
    }
}

int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0; i<n; ++i) cin>>a[i];
    quicksort(a, 0, n-1);
    for(int i=0; i<n; ++i) cout<<a[i]<<' ';
    system("pause");
    return 0;
}