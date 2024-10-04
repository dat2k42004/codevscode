#include <iostream>
#include <queue>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    int x;
    queue<int> q;
    while(n--)
    {
        cin>>x;
        if(x==1)
        {
            cout<<q.size();
            cout<<endl;
        }
        else if(x==2)
        {
            if(q.empty()) cout<<"YES";
            else cout<<"NO";
            cout<<endl;
        }
        else if(x==3)
        {
            int y;
            cin>>y;
            q.push(y);
            if(n==1) cout<<endl;
        }
        else if(x==4)
        {
            if(!q.empty()) q.pop();
            if(n==1) cout<<endl;
        }
        else if(x==5)
        {
            if(!q.empty()) cout<<q.front();
            else cout<<-1;
            cout<<endl;
        }
        else
        {
            if(!q.empty()) cout<<q.back();
            else cout<<-1;
            cout<<endl;
        }
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