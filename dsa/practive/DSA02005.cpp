#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n;
vector<int> v(100);
string s;
int a[100]={0};
void assign()
{
    for(int i=1; i<=n; i++) v[i]=i;
}

void result()
{
    for(int i=1; i<=n; i++) cout<<s[v[i]-1];
    cout<<" ";
}

void next(int i)
{
    for(int j=1; j<=n; j++)
    {
        if(a[j]==0)
        {
            v[i]=j;
            a[j]=1;
            if(i==n) result();
            else next(i+1);
            a[j]=0;
        }
    }
}


void solve()
{
    cin>>s;
    n=s.size();
    v.clear();
    assign();
    next(1);
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