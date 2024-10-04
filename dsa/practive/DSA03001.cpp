#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
vector<int> v{ 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
void greedy(int n, vector<int> v, int a[])
{
    for(int i=9; i>=0; --i)
    {
        a[i]=0;
        while(v[i]<=n) 
        {
            n-=v[i];
            a[i]++;
        }
    }
}
void solve()
{
    int n;
    cin>>n;
    int a[10];
    greedy(n, v, a);
    int sum=0;
    for(int i=0; i<=9; ++i) sum+=a[i];
    cout<<sum<<endl;
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