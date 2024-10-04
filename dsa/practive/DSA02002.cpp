#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n, m;
vector<int>v[100];
int res=0;

void setup()
{
    for(int i=1; i<m; i++)
    {
        n--;
        v[i].clear();
        for(int j=0; j<n; j++)
        {
            v[i].push_back(v[i-1][j]+v[i-1][j+1]);
        }
    }
}

void solve()
{
    cin>>n;
    m=n;
    v[0].clear();
    for(int i=0; i<n; i++) 
    {
        int x;
        cin>>x;
        v[0].push_back(x);  
    }
    setup();
    for(int i=m-1; i>=0; i--)
    {
        cout<<"[";
        for(int j=0; j<v[i].size(); j++) 
        {
            if(j!=v[i].size()-1) cout<<v[i][j]<<" ";
            else cout<<v[i][j];
        }
        cout<<"]"<<' ';
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
    system("pause");
    return 0;
}
