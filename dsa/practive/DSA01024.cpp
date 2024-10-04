#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;

int n, k, ok, m;
vector<int>a(k+1);
vector<string> kq;

void prin()
{
	for(int i=1; i<=k; i++)
	{
		cout<<kq[a[i]-1]<<' ';
	}
	cout<<endl;
}

void tri(int i)
{
	for(int j=a[i-1]+1; j<=m-k+i; ++j)
	{
		a[i]=j;
		if(i==k) prin();
		else tri(i+1);
	}
}


void solve()
{
    cin>>n>>k;
    vector<string> v(n+1);
    set<string> s;
    for(int i=0; i<n; i++)
    {
        string x;
        cin>>x;
        v.push_back(x);
        s.insert(x);
    }
    for(auto x: s) kq.push_back(x);
    m=kq.size();
    tri(1);
    
}
int main()
{
    solve();
    system("pause");
    return 0;
}