#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<vector<int>> v(n+1, vector<int> (n+1, 0));
    string s;
    cin.ignore();
    for(int i=1; i<=n; ++i)
    {
        getline(cin, s);
        s+=" ";
        int res=0;
        for(int j=0; j<s.size(); ++j)
        {
            if(s[j]>='0' && s[j]<='9')
            {
                res=res*10+s[j]-'0';
            }
            else{
                v[res][i]=v[i][res]=1;
                res=0;
            }
        }
    }
    for(int i=1; i<=n; ++i)
    {
        for(int j=1; j<=n; ++j) cout<<v[i][j]<<' ';
        cout<<endl;
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}