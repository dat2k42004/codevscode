#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;




void solve()
{
    int a[4];
    for(int i=1; i<=3; i++) a[i]=0;
    while(1)
    {
        cout<<"02/02/2";
        for(int i=1; i<=3; i++)
        {
            if(a[i]==0) cout<<'0';
            else cout<<'2';
        }
        cout<<endl;
        int i=3;
        while(i>0 && a[i]==1) i--;
        if(i==0) break;
        a[i]=1;
        for(int j=i+1; j<=3; j++) a[j]=0;
    }
    for(int i=1; i<=3; i++) a[i]=0;
    while(1)
    {
        cout<<"20/02/2";
        for(int i=1; i<=3; i++)
        {
            if(a[i]==0) cout<<'0';
            else cout<<'2';
        }
        cout<<endl;
        int i=3;
        while(i>0 && a[i]==1) i--;
        if(i==0) break;
        a[i]=1;
        for(int j=i+1; j<=3; j++) a[j]=0;
    }
    for(int i=1; i<=3; i++) a[i]=0;
    while(1)
    {
        cout<<"22/02/2";
        for(int i=1; i<=3; i++)
        {
            if(a[i]==0) cout<<'0';
            else cout<<'2';
        }
        cout<<endl;
        int i=3;
        while(i>0 && a[i]==1) i--;
        if(i==0) break;
        a[i]=1;
        for(int j=i+1; j<=3; j++) a[j]=0;
    }
}

int main()
{
    solve();
    system("pause");
    return 0;
}