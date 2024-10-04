#include <iostream>

using namespace std;
int n, m;
int a[1001][1001], vs[1001];
void dfs(int s)
{
	vs[s]=1;
	for(int i=1; i<=n; ++i)
	{
		if(vs[i]==0 && a[s][i]==1)
		{
			dfs(i);
		}
	}
}
void solve()
{
	cin>>n>>m;
	int x, y;
	for(int i=1; i<=n; ++i)
	{
		for(int j=1; j<=n; ++j) a[i][j]=0;
	}
	for(int i=1; i<=m; ++i)
	{
		cin>>x>>y;
		a[x][y]=a[y][x]=1;
	}
	for(int i=1; i<=n; ++i) vs[i]=0;
	int res=0;
	for(int i=1; i<=n; ++i)
	{
		if(vs[i]==0) 
		{
			res++;
			dfs(i);
		}
	}
	for(int i=1; i<=n; ++i)
	{
		int cnt=0;
		for(int j=1; j<=n; ++j) vs[j]=0;
		vs[i]=1;
		for(int j=1; j<=n; ++j)
		{
			if(vs[j]==0)
			{
				cnt++;
				dfs(j);
			}
		}
		if(cnt>res) cout<<i<<' ';
	}
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
	return 0;
}