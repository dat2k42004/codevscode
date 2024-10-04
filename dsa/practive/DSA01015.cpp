#include <iostream>
#include <vector>
#include <queue>

using namespace std;
void solve()
{
    long long n;
    cin>>n;
    queue<long long> q;
    q.push(9);
    while(1)
    {
        long long k=q.front();
        q.pop();
        if(k%n==0)
        {
            cout<<k;
            break;
        }
        else
        {
            q.push(k*10);
            q.push(k*10+9);
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
    return 0;
}