#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solve()
{
    int n, k;
    cin >> n >> k;
    vector <int> v;
    for(int i = 0; i < k; ++i) 
    {
        v.push_back(i + 1);
    }
    while(1)
    {
        for( int x : v) cout << x;
        cout << ' ';
        int i = k - 1;
        while(i > -1 && v[i] > n - k + i)
        {
            i--;
        }
        if(i == -1) break;
        v[i] += 1;
        for(int j = i + 1; j < k; j++) v[j] = v[i] + j - i;
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