#include <iostream>
#include <queue>

using namespace std;
void solve()
{
    long long n;
    cin>>n;
    queue<long long> q;
    q.push(1);
    int cnt=0;
    while(!q.empty())
    {
        long long res=q.front();
        q.pop();
        if(res<=n)
        {
            cnt++;
        }
        else break;
        q.push(res*10);
        q.push(res*10+1);
    }
    cout<<cnt<<endl;
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