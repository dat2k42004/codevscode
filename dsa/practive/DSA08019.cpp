#include <iostream>
#include <queue>
#include <stack>
#include <cmath>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        queue<string> q;
        stack<string> s;
        long long sum=0;
        for(int i=1; i<=n; ++i) sum+=pow(2, i);
        cout<<sum<<endl;
        q.push("6");
        q.push("8");
        while(q.size())
        {
            string res=q.front();
            s.push(res);
            q.pop();
            if(res.size()<n)
            {
                q.push(res+"6");
                q.push(res+"8");
            }
        }
        while(s.size())
        {
            cout<<s.top()<<' ';
            s.pop();
        }
        cout<<endl;
    }
}