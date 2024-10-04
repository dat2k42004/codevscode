#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


int n, k;
vector<int> v(100);
int a[100];
int ok;
void assign()
{
    for(int i=1; i<=n; ++i) v[i]=1;
}

void result()
{
    int sum=0;
    int cnt=0;
    for(int i=1; i<=n; i++)
    {
        if(v[i]==1) sum+=a[i-1], cnt=i;
    }
    if(sum==k) 
    {
        ok=1;
        cout<<"[";
        for(int i=1; i<=n; i++) 
        {
            if(v[i]==1) 
            {
                if(i!=cnt) cout<<a[i-1]<<' ';
                else cout<<a[i-1];
            }
        }
        cout<<"] ";
    }
}

void next(int i)
{
    for(int j=1; j>=0; j--)
    {
        v[i]=j;
        if(i==n) result();
        else next(i+1);
    }
}

void solve()
{
    cin>>n>>k;
    for(int i=0; i<n; i++) cin>>a[i];
    sort(a, a+n);
    ok=0;
    assign();
    next(1);
    if(ok==0) cout<<-1;
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