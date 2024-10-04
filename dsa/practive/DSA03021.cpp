#include <bits/stdc++.h>

using namespace std;
bool check(int i, vector<int> a)
{
    for(int x: a)
    {
        if(x/i==x/(i+1)) return 0;
    }
    return 1;
}
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    sort(v.begin(), v.end());
    int res=0;
    for(int i=v[0]; i>=1; --i)
    {
        if(check(i, v))
        {
            for(int x: v)
            {
                res+=x/(i+1)+1;
            }
            break;
        }
    }
    cout<<res<<endl;
}
int main()
{
    solve();
    return 0;
}