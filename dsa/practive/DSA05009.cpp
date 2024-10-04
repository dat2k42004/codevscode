#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
int n, s, ok;
vector<int> v;
void next(int pos, int k)
{
    if(ok==1)
    {
        return;
    }
    if(k==s)
    {
        ok=1;
        return;
    }
    if(pos<n)
    {
        if(k+v[pos]<=s)
        {
            next(pos+1, k+v[pos]);
        }
        next(pos+1, k);
    }
}
void solve()
{
    cin>>n;
    int sum=0;
    v.clear();
    for(int i=0; i<n; ++i)
    {
        int x;
        cin>>x;
        v.push_back(x);
        sum+=x;
    }
    if(sum%2==1) cout<<"NO";
    else
    {
        s=sum/2;
        ok=0;
        next(0, 0);
        if(ok==1) cout<<"YES";
        else cout<<"NO";
    }
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
