#include <bits/stdc++.h>

using namespace std;
void solve()
{
    int n;
    cin>>n;
    string s;
    cin>>s;
    map<char, int> m;
    for(int i=0; i<n; ++i)
    {
        m[s[i]]++;
    }
    int res=0;
    for(int i=0; i<m['X']; ++i)
    {
        if(s[i]=='T')
        {
            for(int j=m['X']; j<n; ++j)
            {
                if(s[j]=='X')
                {
                    swap(s[i], s[j]);
                    res++;
                    break;
                }
            }
        }
        else if(s[i]=='D')
        {
            for(int j=n-1; j>=m['X']; --j)
            {
                if(s[j]=='X')
                {
                    swap(s[i], s[j]);
                    res++;
                    break;
                }
            }
        }
    }
    for(int i=m['X']; i<m['X']+m['T']; ++i)
    {
        if(s[i]=='D')
        {
            for(int j=m['X']+m['T']; j<n; ++j)
            {
                if(s[j]=='T')
                {
                    swap(s[i], s[j]);
                    res++;
                    break;
                }
            }
        }
    }
    cout<<res;
}
int main()
{
    solve();
    return 0;
}