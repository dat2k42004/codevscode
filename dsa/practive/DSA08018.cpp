#include <iostream>
#include <queue>
#include <stack>
#include <algorithm>
#include <cmath>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        queue<string> q;
        q.push("6");
        q.push("8");
        long long cnt=0;
        for(int i=1; i<=n; ++i) cnt+=pow(2, i);
        cout<<cnt<<endl;
        while(q.size())
        {
            string res=q.front();
            cout<<res<<' ';
            q.pop();
            if(res.size()!=n)
            {
                q.push(res+"6");
                q.push(res+"8");
            }
        }
        cout<<endl;
    }
}