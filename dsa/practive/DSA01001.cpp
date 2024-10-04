#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;


void solve()
{
    string s;
    cin >> s;
    int i = s.size()-1;
    while(i > -1 && s[i] == '1') i--;
    for(int j = i + 1; j<s.size(); ++j) s[j] = '0';
    if(i == -1) cout << "0" + s;
    else 
    {
        s[i] = '1';
        cout << s;
    }
    cout<<"\n";
}

int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        solve();
    }
    system("pause");
    return 0;
}