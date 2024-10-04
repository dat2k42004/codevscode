#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;


void solve()
{
    int n;
    cin >> n;
    vector <int> v;
    for(int i = 0; i < n; ++ i) 
    {
        int x;
        cin >> x;
        v.push_back(x);
    }
    int i = n - 2;
    while(i > -1 && v[i] >= v[i + 1]) i--;
    if(i == -1) 
    {
        for(int j = 1; j <= n; ++ j) cout << j << ' ';
    }
    else
    {
        int k = n - 1;
        while(k > i && v[k] < v[i]) k--;
        swap(v[k], v[i]);
        int l = i + 1, r = n - 1;
        while(l < r) 
        {
            swap(v[l], v[r]);
            l++;
            r--;
        }
        for(int x : v) cout << x << ' ';
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