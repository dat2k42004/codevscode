#include <iostream>
#include <stack>
#include <algorithm>
#include <vector>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0; i<n; ++i) cin>>v[i];
    stack<int> st;
    st.push(-1);
    for(int i=0; i<n; ++i)
    {

        while(st.size()>1 && v[i]>=v[st.top()])
        {
            st.pop();
        }
        cout<<i-st.top()<<' ';
        st.push(i);
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