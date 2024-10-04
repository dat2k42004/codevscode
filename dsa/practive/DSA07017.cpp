#include <iostream>
#include <vector>
#include <stack>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    vector<int> a(n), c(n, -1), b(n, -1);
    stack<int> st1, st2;
    for(int i=0; i<n; ++i) cin>>a[i];
    for(int i=0; i<n; ++i)
    {
        while(!st1.empty() && a[i]>a[st1.top()])
        {
            c[st1.top()]=i;
            st1.pop();
        }
        st1.push(i);
    }
    for(int i=0; i<n; ++i)
    {
        while(!st2.empty() && a[i]<a[st2.top()])
        {
            b[st2.top()]=i;
            st2.pop();
        }
        st2.push(i);
    }
    for(int i=0; i<n; ++i)
    {
        if(c[i]==-1 || b[c[i]]==-1)
        {
            cout<<-1<<' ';
        }
        else cout<<a[b[c[i]]]<<' ';
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