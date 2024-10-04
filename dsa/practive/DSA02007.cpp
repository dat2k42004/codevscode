#include <bits/stdc++.h>

using namespace std;
string res;
void next(string s, int k)
{
    if(k==0) return;
    for(int i=0; i<s.size(); ++i)
    {
        
        for(int j=i+1; j<s.size(); ++j)
        {
            if(s[j]>s[i])
            {
                swap(s[i], s[j]);
                res=max(s, res);
                next(s, k-1);
                swap(s[i], s[j]);
            }
        }
        
    }
}
void solve()
{
    int k;
    cin>>k;
    string s;
    cin>>s;
    res=s;
    next(s, k);
    cout<<res<<endl;
}
int main()
{
    cin.tie(0);
    ios_base::sync_with_stdio(0);
    cout.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    return 0;
}