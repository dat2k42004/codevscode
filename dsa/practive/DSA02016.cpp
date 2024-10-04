#include <iostream>
#include <vector>
#include <algorithm>
#include <cstring>


using namespace std;

int n;
int v[50], res[50], d1[50], d2[50];
int cnt;
int a[12][12];

void result()
{
    memset(a, 0, sizeof(a));
    for(int i=1; i<=n; ++i)
    {
        a[i][v[i]]=1;
    }
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=n; ++j) cout<<a[i][j];
        cout<<endl;
    }
}

void next(int i)
{
    for(int j=1; j<=n; ++j)
    {
        if(res[j]==1 && d1[i-j+n]==1 && d2[i+j-1]==1)
        {
            v[i]=j;
            res[j]=d1[i-j+n]=d2[i+j-1]=0;
            if(i==n)
            {
                //result();
                cnt++;
            }
            else next(i+1);
            res[j]=d1[i-j+n]=d2[i+j-1]=1;
        }
    }
}

void solve()
{
    cin>>n;
    cnt=0;
    for(int i=1; i<=49; i++) 
    {
        //v[i]=0;
        res[i]=d1[i]=d2[i]=1;
    }
    next(1);
    cout<<cnt<<endl;
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