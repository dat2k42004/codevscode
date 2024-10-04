#include <iostream>
#include <algorithm>
#include <vector>
#include <stack>
using namespace std;
void solve()
{
    int n, k, u;
    cin>>n>>k>>u;
    vector<vector<int>> v(n+1, vector<int> (n+1, 0));
    for(int i=1; i<=k; ++i)
    {
        int x, y;
        cin>>x>>y;
        v[x][y]=v[y][x]=1;
    }
    vector<int> vs(n+1, 0);
    stack<int> st;
    st.push(u);
    while(!st.empty())
    {
        int x=st.top();
        st.pop();
        if(!vs[x])
        {
            cout<<x<<' ';
            vs[x]=1;
        }
        for(int i=1; i<=n; ++i)
        {
            if(vs[i]==0 && v[x][i]==1)
            {
                st.push(x);
                st.push(i);
                break;
            }
        }
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
