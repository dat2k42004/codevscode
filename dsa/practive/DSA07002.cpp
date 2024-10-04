#include <iostream>
#include <stack>
#include <vector>
#include <algorithm>

using namespace std;
void solve()
{
    int t;
    cin>>t;
    string s;
    int n;
    stack<int> st;
    while(t--)
    {
        cin>>s;
        if(s=="PUSH")
        {
            cin>>n;
            st.push(n);
        }
        else if(s=="POP")
        {
            if(st.size())
                st.pop();
        }
        else if(s=="PRINT")
        {
            if(st.size())
                cout<<st.top()<<endl;
            else 
                cout<<"NONE"<<endl;
        }
    }
}
int main()
{
    solve();
    system("pause");
    return 0;
}