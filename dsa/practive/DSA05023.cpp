#include <iostream>

using namespace std;
void solve()
{
    string s;
    cin>>s;
    long long sum=0;
    for(int i=1; i<=s.size(); ++i)
    {
        for(int j=0; j<=s.size()-i; ++j)
        {
            sum+=stoll(s.substr(j, i));
        }
    }
    cout<<sum<<endl;
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