#include <iostream>
#include <vector>

using namespace std;

int n, k, ok;
vector<int> v(n+1);
int a[100]={0};


void prin()
{
    for(int i=1; i<=n; i++) cout<<v[i]<<" ";
    cout<<endl;
}

// quay lui nhi phan
void trynhiphan(int i)
{
    for(int j=0; j<=1; j++)
    {
        v[i]=j;
        if(i==n) prin();
        else
        {
            trynhiphan(i+1);
        }
    }
}
//quay lui to hop
void trytohop(int i)
{
    for(int j=v[i-1]+1; j<=n-k+i; ++j)
    {
        v[i]=j;
        if(i==k) prin();
        else trytohop(i+1);
    }
}


//quay lui hoan vi
void tryhoanvi(int i)
{
    for(int j=1; j<=n; j++)
    {
        if(a[j]==0)
        {
            v[i]=j;
            a[j]=1;
            if(i==n) prin();
            else tryhoanvi(i+1);
            a[j]=0;
        }
    }
}


int main()
{
    cin>>n;
    for(int i=0; i<=n; i++) v[i]=0;
    //trynhiphan(1);
    //trytohop(1);
    tryhoanvi(1);
    system("pause");
    return 0;
}
