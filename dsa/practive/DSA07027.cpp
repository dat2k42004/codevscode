#include <iostream>
#include <stack>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n), a(n, -1);
    for(int i=0; i<n; ++i)
    {
        cin>>v[i];
    }
    stack<int> st;
    for(int i=0; i<n; ++i)
    {
        while(!st.empty() && v[i]>v[st.top()])
        {
            a[st.top()]=i;
            st.pop();
        }
        st.push(i);
    }
    for(int i=0; i<n; ++i) 
    {
        if(a[i]==-1) cout<<-1<<' ';
        else cout<<v[a[i]]<<' ';
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