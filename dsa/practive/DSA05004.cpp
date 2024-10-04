#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    int list[n]={1};
    int res=list[0];
    for(int i=1; i<n; ++i)
    {
        for(int j=0; j<i; ++j)
        {
            if(v[i]>v[j] && list[j]+1>list[i]) list[i]=list[j]+1;
        }
        res=max(list[i], res);
    }
    cout<<res<<endl;
}
int main()
{
    solve();
    system("pause");
    return 0;
}