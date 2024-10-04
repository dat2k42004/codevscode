#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int n;
string s="";

void assign()
{
    s="8";
    for(int i=1; i<n; i++) 
    {
        s+="6";
    }
    s[n]='\0';
}

bool check()
{
    if(s.find("88", 0)!=-1 || s.find("6666", 1)!=-1) return 0;
    return 1;
}


void solve()
{
    cin>>n;
    assign();
    while(1)
    {
    	if(check()) cout<<s<<endl;
    	//cout<<s<<endl;
        int i=n-2;
        while(i>0 && s[i]=='8') i--;
        if(i==0) break;
        s[i]='8';
        for(int j=i+1; j<n-1; j++) s[j]='6';
    }
}

int main()
{
    solve();
    system("pause");
    return 0;
}