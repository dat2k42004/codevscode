#include <iostream>

using namespace std;

void next(int n, char a, char c, char b)
{
    if(n==1) 
    {
        cout<<a<<" -> "<<c<<endl;
        return;
    }
    next(n-1, a, b, c);
    cout<<a<<" -> "<<c<<endl;
    next(n-1, b, c, a);
}


void solve()
{
    int n;
    cin>>n;
    next(n, 'A', 'C', 'B');
}
int main()
{
    solve();
    system("pause");
    return 0;
}
