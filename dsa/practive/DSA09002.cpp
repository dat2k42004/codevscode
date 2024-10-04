#include <iostream>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;

void solve()
{
    int n;
    cin>>n;
    set<pair<int, int>> s;
    cin.ignore();
    for(int i=0; i<n; ++i)
    {
        string r;
        getline(cin, r);
        r+=" ";
        int k=0;
        for(int j=0; j<r.size(); ++j)
        {
            if(r[i]>='0' && r[i]<='9')
            {
                k=k*10+r[i]-'0';
            }
            else
            {
                int a=i+1, b=k;
                if(a>b) swap(a, b);
                s.insert(make_pair(a, b));
                k=0;
            }
        }
    }
    for(auto x: s)
    {
        cout<<x.first<<' '<<x.second;
        cout<<endl;
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}