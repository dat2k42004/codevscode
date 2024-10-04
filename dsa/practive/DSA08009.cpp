#include <iostream>
#include <queue>
#include <algorithm>
#include <vector>
#include <map>
#define ll long long
using namespace std;
void solve()
{
    ll s, t;
    cin>>s>>t;
    queue<pair<int, int>> q;
    map<int, int> m;
    pair<int, int> p;
    p.first=s;
    p.second=0;
    q.push(p);
    while(q.size())
    {
        p=q.front();
        if(p.first==t)
        {
            cout<<p.second<<endl;
            break;
        }
        q.pop();
        if(p.first<=t && !m[p.first*2])
        {
            m[p.first*2]++;
            q.push({p.first*2, p.second+1});
        }
        if(p.first>1 && !m[p.first-1])
        {
            m[p.first-1]++;
            q.push({p.first-1, p.second+1});
        }
    }
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