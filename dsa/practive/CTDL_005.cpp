#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    int n;
    cin>>n;
    vector<int> v;
    for(int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    int k;
    cin>>k;
    while(find(v.begin(), v.end(), k)!=v.end())  
    {
        v.erase(find(v.begin(), v.end(), k));
    }
    for(int x:v) cout<<x<<' ';
    system("pause");
    return 0;
}