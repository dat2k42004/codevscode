#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int n;
vector<int> v(n);

void setup()
{
    vector<int> a;
    for(int i=0; i<n-1; i++)
    {
        a.push_back(v[i]+v[i+1]);
    }
    v.clear();
    n--;
    for(int i=0; i<n; i++)
    {
        v.push_back(a[i]);
    }
}

void solve()
{
    cin>>n;
    for(int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    while(n>=1)
    {
        cout<<"[";
        for(int i=0; i<n; i++)
        {
            if(i!=n-1) cout<<v[i]<<' ';
            else cout<<v[i];
        }
        cout<<"]"<<endl;
        setup();
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