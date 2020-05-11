#include<iostream>
#include<string>
using namespace std;
int main()
{
    string s;
    string b;
    getline(cin,s);
    for(int i = 0 ; i < s.length() ; i++)
    {
        if(isalpha(s[i]))
        b += s[i];
    }
    cout<<b;
}