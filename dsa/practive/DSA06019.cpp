#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;
bool cmp(pair<int, int> a, pair<int, int> b)
{
	if (a.second > b.second)
		return 1;
	if (a.second == b.second && a.first < b.first)
		return 1;
	return 0;
}


void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    map<int, int> m;
    vector<pair<int, int>> p;
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
        m[v[i]]++;
    }
    for(int i=0; i<n; i++) 
    {
        p.push_back(make_pair(v[i], m[v[i]]));
    }
    sort(v.begin(), v.end(), cmp);
    for(int i=0; i<p.size(); ++i) cout<<p[i].first<<' ';
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