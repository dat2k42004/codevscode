#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n, m, x, y;
		cin>>n>>m>>x>>y;
		vector<vector<int>> v(n+1);
		for(int i=0; i<m; ++i)
		{
			int a, b;
			cin>>a>>b;
			v[a].push_back(b);
		}
		int e[n+1]={0}, vs[n+1]={0};
		stack<int> s;
		s.push(x);
		vs[x]=1;
		while(!s.empty())
		{
			int u=s.top();
			int ok=0;
			for(int i: v[u])
			{
				if(vs[i]==0)
				{
					vs[i]=1;
					e[i]=u;
					s.push(i);
					ok=1;
					break;
				}
			}
			if(ok==0) s.pop();
		}
		if(vs[y]==0) cout<<-1;
		else 
		{
			vector<int> kq;
			int k=y;
			while(k!=x)
			{
				kq.push_back(k);
				k=e[k];
			}
			kq.push_back(k);
			for(int i=kq.size()-1; i>=0; --i) cout<<kq[i]<<' ';
		}
		cout<<endl;
	}
    system("pause");
	return 0;
}