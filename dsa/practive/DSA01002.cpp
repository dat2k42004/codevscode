#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;


void solve()
{
    int n, k;
    cin >> n >> k;
    vector <int> v;
    for(int i = 0; i < k; i ++) 
    {
        int x;
        cin >> x;
        v.push_back(x);
    }
    int i = k - 1;
    while(i > -1 && v[i] >  n - k + i) i--;
    if(i == -1) 
    {
        for(int j = 1; j <= k; j++) cout << j << ' ';
    }
    else
    {
        v[i] += 1;
        for(int j = i + 1; j < k; j ++) v[j] = v[i] + j - i;
        for(int x : v) cout << x <<' ';
    }
    cout << endl;
}


int main()
{
    int t;
    cin >> t;
    while(t --)
    {
        solve();
    }
    system("pause");
    return 0;
}