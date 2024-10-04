#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    priority_queue<int, vector<int>, greater<int>> pq;
    for(int i=0; i<n; ++i)
    {
        int x;
        cin>>x;
        pq.push(x);
    }
    long long sum=0;
    while(pq.size()>1)
    {
        int a=pq.top();
        pq.pop();
        int b=pq.top();
        pq.pop();
        sum+=a+b;
        pq.push(a+b);
    }
    cout<<sum<<endl;
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