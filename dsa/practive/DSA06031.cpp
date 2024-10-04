#include <iostream>
#include <vector>
#include <algorithm>
#include <deque>

using namespace std;
void solve()
{
    int n, k;
    cin>>n>>k;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    deque<int> d;
    for(int i=0; i<n; ++i)
    {
        while(d.size() && v[d.back()]<=v[i])
        {
            d.pop_back();
        }
        d.push_back(i);
        if(d.front()+k<=i) d.pop_front();
        if(i>=k-1) cout<<v[d.front()]<<' ';
    }
    cout<<endl;
}
int main()
{
    ios_base::sync_with_stdio(0);
	cin.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
        solve();
    }
    system("pause");
    return 0;
}