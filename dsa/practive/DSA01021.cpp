#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(k+1);
    for(int i=1; i<=k; i++)
    {
        int x;
        cin>>x;
        v[i]=x;
    }
    //for(int i=1; i<=k; i++) cout<<v[i] << ' ';
    vector<int>kq(k+1);
    int res=0;
    int i=k;
    while(i>0 && v[i]>=n-k+i) i--;
    if(i==0) res=k;
    else
    {
        kq[i]=v[i]+1;
        for(int j=i+1; j<=k; j++)
        {
            kq[j]=kq[i]+j-i;
        }
        for(int j=1; j<i; j++) kq[j]=v[j];
        for(int j=1; j<=k; j++)
        {
        	if(find(v.begin(), v.end(), kq[j])==v.end()) res++;
		}
    }
    cout<<res<<endl;
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