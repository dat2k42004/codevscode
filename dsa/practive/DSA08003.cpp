#include <iostream>
#include <deque>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    string s;
    deque<int> q;
    while(n--)
    {
        cin>>s;
        int x;
        if(s=="PUSHBACK")
        {
            cin>>x;
            q.push_back(x);
        }
        else if(s=="PUSHFRONT")
        {
            cin>>x;
            q.push_front(x);
        }
        else if(s=="PRINTFRONT")
        {
            if(!q.empty()) cout<<q.front()<<endl;
            else cout<<"NONE"<<endl;
        }
        else if(s=="PRINTBACK")
        {
            if(!q.empty()) cout<<q.back()<<endl;
            else cout<<"NONE"<<endl;
        }
        else if(s=="POPBACK") 
        {
            if(!q.empty()) q.pop_back();
        }
        else 
        {
            if(!q.empty()) q.pop_front();
        }
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}