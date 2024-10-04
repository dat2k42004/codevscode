#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


void solve()
{
    int n;
    cin >> n;
    vector <int> v;
    for(int i = 0; i < n; ++i) 
    {
        v.push_back(n - i);
    }
    while(1)
    {
        for(int x : v) cout << x ;
        cout << ' ';
        int i = n - 2;
        while(i > -1 && v[i] < v[i + 1]) i --;
        if(i == -1) break;
        int k = n - 1;
        while(k > i && v[k] > v[i]) k--;
        swap(v[i], v[k]);
        int l = i+1, r = n-1;
        while(l < r)
        {
            swap(v[l], v[r]);
            l ++;
            r --;
        }
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