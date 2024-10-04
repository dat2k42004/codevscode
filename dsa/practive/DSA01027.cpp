#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;


int n;
vector<int> v(n+1);
vector<int> a(n+1);
int u[100] ={0};
void in()
{
    cin>>n;
    for(int i=1; i<=n; i++)
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    sort(v.begin(), v.end());
}

void out()
{
    for(int i=1; i<=n; i++) 
    {
        cout<<v[a[i]]<<" ";
        //cout<<a[i]<<' ';
    }
    cout<<endl;
}

void tri(int i)
{
    for(int j=1; j<=n; j++)
    {
        if(u[j]==0)
        {
            a[i]=j;
            u[j]=1;
            if(i==n) out();
            else tri(i+1);
            u[j]=0;
        }
    }
}


int main()
{
    in();
    tri(1);
    system("pause");
    return 0;
}