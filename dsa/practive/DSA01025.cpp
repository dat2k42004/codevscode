#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;


int n, k;
vector<int> v(k+1);

void prin()
{
    for(int i=1; i<=k; i++)
    {
        cout<<(char)(64+v[i]);
    }
    cout<<endl;
}

void tri(int i)
{
    for(int j=v[i-1]+1; j<=n-k+i; j++)
    {
        v[i]=j;
        if(i==k) prin();
        else tri(i+1); 
    }
}

void solve()
{
    cin>>n>>k;
    tri(1);
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