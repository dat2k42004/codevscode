/* Code By FL.T1 */
#include <bits/stdc++.h>

using namespace std;

typedef long long ll;
typedef long double ld;

#define faster() ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define run() int T; cin >> T; while(T--)
#define vt(x) vector<x> 
#define all(x) x.begin(), x.end()
#define sz(x) x.size()
#define fi first
#define se second
#define pb(a) push_back(a)
#define mp(a, b) make_pair(a, b)
#define fr(i, a, b) for (int i = a; i < b; ++i)
#define fe(i, a, b) for (int i = a; i <= b; ++i)
#define dr(i, a, b) for (int i = a; i > b; --i)
#define de(i, a, b) for (int i = a; i >= b; --i)
#define in(x, n) fr(itr, 0, n) cin >> x[itr]
#define out(x, n, sep) fr(itr, 0, n) cout << x[itr] << sep
#define reset(x, n, value) fr(itr, 0, n) x[itr] = value

ll mark[5001];

ll calc(int n)
{
	if (n < 8) 
		return mark[n] = n;
	else if (mark[n] == 0)
	{
		mark[n] = n;
		for (int i = 2; i <= sqrt(n); ++i) {
			ll tmp = calc(i) + calc(n / i) + 2;
			int tmp2 = n - n / i * i;
			if (tmp2)
				tmp += 2 + calc(tmp2);
			mark[n] = min(mark[n], tmp);
		}
	}
	return mark[n];
}

void solve()
{
	int n;
	cin >> n;
	cout << calc(n) << '\n';
//	for (int i = 0; i <= n; ++i) cout << mark[i] << ' ';
//	cout << '\n';
//	for(int i = 1; i < 5001; ++ i)
//	{
//		cout << calc(i) << '\n';
//	}
}

int main()
{
    faster();
    reset(mark, 5001, 0);
    run() 
        solve();
    return 0;
}
/* Code By FL.T1 */