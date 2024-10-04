#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
void solve()
{
    int n;
    string s;
    cin>>n>>s;
    int i=s.size()-2;
    while(i>=0 && s[i]>=s[i+1]) i--;
    cout<<n<<' ';
    if(i==-1) cout<<"BIGGEST";
    else
    {
        int k=s.size()-1;
        while(k>i && s[k]<=s[i]) --k;
        swap(s[i], s[k]);
        int l=i+1, r=s.size()-1;
        while(l<r)
        {
            swap(s[l], s[r]);
            l++;
            r--;
        }
        cout<<s;
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
    return 0;
}