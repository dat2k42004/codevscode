#include <iostream>
#include <vector>
#include <queue>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    queue<int> q;
    q.push(9);
    while(!q.empty())
    {
        long long res=q.front();
        q.pop();
        if(res%n==0)  
        {
            cout<<res<<endl;
            break;
        }
        q.push(res*10);
        q.push(res*10+9);
    }
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