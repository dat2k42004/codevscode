#include <iostream>
#include <queue>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    string s;
    queue<int> q;
    while(n--)
    {
        cin>>s;
        if(s=="PUSH")
        {
            int x;
            cin>>x;
            q.push(x);
        }
        else if(s=="POP")
        {
            if(!q.empty()) q.pop();
        }
        else 
        {
            if(!q.empty()) cout<<q.front();
            else cout<<"NONE";
            cout<<endl;
        }
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}