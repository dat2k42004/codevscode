#include <iostream>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;

int n, k, m;
vector<int> v(m);
vector<int> a(k+1);
void in()
{
    cin>>n>>k;
    for(int i=0; i<n; i++)
    {
        int x;
        cin>>x;
        if(find(v.begin(), v.end(), x)==v.end()) v.push_back(x);
    }
    sort(v.begin(), v.end());
    m=v.size();
}

void out()
{
    for(int i=1; i<=k; i++)
    {
        cout<<v[a[i]-1]<<' ';
    }
    cout<<endl;
}

void tri(int i)
{
    for(int j=a[i-1]+1; j<=m-k+i; j++)
    {
        a[i]=j;
        if(i==k) out();
        else tri(i+1); 
    }
}

int main()
{
    in();
    a[0]=0;
    tri(1);
    system("pause");
    return 0;
}