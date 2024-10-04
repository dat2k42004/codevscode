#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;


void solve()
{
    int n;
    cin>>n;
    vector<int> v;
    for(int i=0; i<n; i++) 
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    for(int i=0; i<v.size()-1; i++)
    {
        while(find(v.begin()+i+1, v.end(), v[i])!=v.end()) v.erase(find(v.begin()+i+1, v.end(), v[i]));
    }
    for(int x: v) cout<<x<<' ';
}


int main()
{
    solve();
    system("puase");
    return 0;
}