#include <iostream>
#include <vector>

using namespace std;

int n, k;
vector<int> v(30);

void next(int i)
{
    for(int j=v[i-1]; j<=n; ++j)
    {
        v[i]=j;
        if(i==k) 
        {
            for(int t=1; t<=k; ++t) cout<<(char)(v[t]+64);
            cout<<endl;
        }
        else next(i+1);
    }
}

void solve()
{
    char x;
    cin>>x>>k;
    n=x-'A'+1;
    v[0]=1;
    next(1);
    //for(int i=1; i<=k; ++i) cout<<x;
    //cout<<n;
}
int main()
{
    solve();
    system("pause");
    return 0;
}