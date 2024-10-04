#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n, ok;
vector<int> v;


void assign()
{
	v.clear();
    v.push_back(1);
    for(int i=1; i<n; i++) v.push_back(0);
}

void next()
{
    int i=n-2;
    while(i>0 && v[i]==1) 
    {
        v[i]=0;
        i--;
    }
    if(i==0) ok=0;
    else v[i]=1;
}

bool check()
{
    for(int i=0; i<n-1; i++) 
    {
        if(v[i]==1 && v[i+1]==1) 
        {
            return 0;
            break;
        }
    }
    return 1;
}

void solve()
{
    cin>>n;
    assign();
    ok=1;
    while(ok)
    {
        if(check())
        {
            for(auto x: v) 
            {
            	if(x==1) cout<<'H';
            	else cout<<'A';
			}
            cout<<endl;
        }
        next();
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