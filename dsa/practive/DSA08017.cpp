#include <iostream>
#include <queue>
#include <algorithm>
#include <stack>

using namespace std;
deque<string> q;
void solve()
{
    int n;
    cin>>n;
    q.clear();
    q.push_back("6");
    q.push_back("8");
    while(1)
    {
        string s=q.front();
        if(s.size()<n)
        {
            q.push_back(s+"6");
            q.push_back(s+"8");
        }
        else break;
    }
    while(!q.empty())
    {
        cout<<q.back()<<' ';
        q.pop_back();
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