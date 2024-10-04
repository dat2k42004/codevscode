#include <iostream>
#include <stack>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    stack<int> st;
    int n;
    string s;
    while(cin>>s)
    {
        if(s=="push") 
        {
            cin>>n;
            st.push(n);
        }
        else if(s=="pop")
        {
            st.pop();
        }
        else if(s=="show")
        {
            if(st.size())
            {
                stack<int> r;
                while(st.size())
                {
                    r.push(st.top());
                    st.pop();
                }
                while(r.size())
                {
                    cout<<r.top()<<' ';
                    st.push(r.top());
                    r.pop();
                }
                cout<<endl;
            }
            else cout<<"empty"<<endl;
        }
    }
}

int main()
{
    solve();
    system("pause");
    return 0;
}