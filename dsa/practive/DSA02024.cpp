#include <iostream>
#include <vector>
#include <set>
#include <algorithm>
#include <string.h>


using namespace std;
int n;
vector<int> a(25);
vector<string> v;
vector<vector<int>> ans;
vector<int> x;
void Try(int pos)
{
    for(int i=pos+1; i<=n; ++i)
    {
        if(a[i]>a[pos])
        {
            x.push_back(a[i]);
            if(x.size()>1)
            {
                ans.push_back(x);
            }
            Try(i);
            x.erase(x.end()-1, x.end());
        }
    }
}
void solve()
{
    cin>>n;
    for(int i=1; i<=n; ++i) cin>>a[i];
    Try(0);
    string k;
    for(int i=0; i<ans.size(); ++i)
    {
        k="";
        for(int j=0; j<ans[i].size(); ++j)
        {
            k+=to_string(ans[i][j]);
            k+=" ";
        }
        v.push_back(k);
    }
    sort(v.begin(), v.end());
    for(int i=0; i<v.size(); ++i) cout<<v[i]<<endl;
}


int main()
{
    solve();
    system("pause");
    return 0;
}