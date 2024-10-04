#include <iostream>
#include <queue>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    queue<long long> q;
    q.push(1);
    while(!q.empty())
    {
        long long res=q.front();
        q.pop();
        if(res%n==0)
        {
            cout<<res;
            break;
        }
        q.push(res*10);
        q.push(res*10+1);
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