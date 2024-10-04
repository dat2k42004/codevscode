#include <iostream>

using namespace std;
void solve()
{
    int n, s;
    cin>>n>>s;
    if(s==0 || (s%n!=0 && s/n==9 ) || s/n>9) cout<<-1<<' '<<-1;
    else
    {
        int a[n]={0}, b[n]={0};
        int x=n, r=s;
        while(s>9 && x>1)
        {
            a[x-1]=9;
            x--;
            s-=9;
        }
        if(x>=2)
        {
            a[x-1]=s-1;
            a[0]=1;
        }
        else a[0]=s;
        int y=0;
        while(r>=9 && y<n)
        {
            r-=9;
            b[y]=9;
            y++;
        }
        if(y<n) b[y]=r;
        for(int i=0; i<n; ++i) cout<<a[i];
        cout<<' ';
        for(int i=0; i<n; ++i) cout<<b[i];
    }
}
int main()
{
    solve();
    return 0;
}