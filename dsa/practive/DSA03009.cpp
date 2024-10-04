#include <bits/stdc++.h>

using namespace std;
struct jb
{
    int a, b, c;
};
bool cmp(jb x, jb y)
{
    return x.c>y.c;
}
void solve()
{
    int n;
    cin>>n;
    vector<jb> v(n);
    for(int i=0; i<n; ++i)
    {
        cin>>v[i].a>>v[i].b>>v[i].c;
    }
    int u[10000]={0}, cnt=0;
    sort(v.begin(), v.end(), cmp);
    int sum=0;
    for(int i=0; i<n; ++i)
    {
        for(int j=v[i].b; j>=1; --j)
        {
            if(u[j]==0)
            {
                u[j]=1;
                sum+=v[i].c;
                cnt++;
                break;
            }
        }
    }
    cout<<cnt<<' '<<sum<<endl;
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