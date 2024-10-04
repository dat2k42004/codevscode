#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void solve()
{
    int n;
    cin>>n;
    vector <char> v;
    for(int i=0; i<n; i++) v.push_back('A');
    while(1)
    {
        for(int i=0; i<n; i++) cout<<v[i];
        cout<<" ";
        int i=n-1;
        while(i>-1 && v[i]=='B') i--;
        if(i==-1) break;
        v[i]='B';
        for(int j=i+1; j<n; j++) v[j]='A';
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