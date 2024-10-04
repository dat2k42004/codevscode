#include <iostream>
#include <vector>

using namespace std;
int n, k, s, cnt;
vector<int> v(11);
void result()
{
    int sum=0;
    for(int i=1; i<=k; ++i) sum+=v[i];
    if(sum==s) cnt++;
    // for(int i=1; i<=k; ++i) cout<<v[i]<<' ';
    // cout<<endl;
}
void next(int i)
{
    for(int j=v[i-1]+1; j<=n-k+i; ++j)
    {
        v[i]=j;
        if(i==k)
        {
            result();
        }
        else next(i+1);
    }
}
void solve()
{
    while(1)
    {
        cin>>n>>k>>s;
        if(n==0 && k==0 && s==0) break;
        cnt=0;
        //v.clear();
        v[0]=0;
        next(1);
        cout<<cnt<<endl;
    }
    // n=9; k=3;
    // next(1);
}
int main()
{
    solve();
    system("pause");
    return 0;
}