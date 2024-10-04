#include <iostream>
#include <vector>

using namespace std;
int find(vector<int> v, int s)
{
    int n=v.size();
    vector<int> dp(s+1, 0);
    dp[0]=1;
    for(int i=0; i<n; ++i)
    {
        for(int j=s; j>=v[i]; --j)
        {
            if(dp[j-v[i]]==1) dp[j]=1;
        }
    }
    return dp[s];
}
void solve()
{
    int n, s;
    cin>>n>>s;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    if(find(v, s)) cout<<"YES";
    else cout<<"NO";
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