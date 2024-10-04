#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
#include <map>

using namespace std;
vector<pair<int, int>> v;
void solve()
{
    string xy, uv;
    cin>>xy>>uv;
    map<string, int> m;
    pair<string, int> p;
    queue<pair<string, int>> q;
    p.first=xy;
    p.second=0;
    q.push(p);
    int res=1e9+1;
    while(q.size())
    {
        p=q.front();
        if(p.first==uv) 
        {
            res=min(res, p.second);   
        }
        q.pop();
        for(int i=0; i<8; ++i)
        {
            string s=p.first;
            s[0]+=v[i].first;
            s[1]+=v[i].second;
            if(s[0]>='a' && s[0]<='h' && s[1]>='1' && s[1]<='8' && !m[s])
            {
                m[s]++;
                q.push({s, p.second+1});
            }
        }
    }
    cout<<res<<endl;
}
int main()
{
    int t;
    cin>>t;
    v.push_back({1, 2});
    v.push_back({2, 1});
    v.push_back({2, -1});
    v.push_back({1, -2});
    v.push_back({-1, -2});
    v.push_back({-2, -1});
    v.push_back({-2, 1});
    v.push_back({-1, 2});
    while(t--)
    {
        solve();
    }
    system("pause");
    return 0;
}