#include <iostream>
#include <queue>
#include <algorithm>
#include <map>
#include <vector>

using namespace std;
void solve()
{
    int k;
    cin>>k;
    string s;
    cin>>s;
    map<long long, long long> m;
    for(int i=0; i<s.size(); ++i)
    {
        m[s[i]-'A']++;
    }
    priority_queue<long long> q;
    for(auto x: m)
    {
        q.push(x.second);
    }
    for(int i=1; i<=k; ++i)
    {
        int n=q.top(); 
        q.pop();
        n--;
        q.push(n);
    }
    long long sum=0;
    while(!q.empty())
    {
        sum+=(q.top())*(q.top());
        q.pop();
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
    system("pause");
    return 0;
}