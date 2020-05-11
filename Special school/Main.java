#include<iostream>
#include<cstring>
#include<string>
#include<algorithm>
using namespace std;
int main()
{
	string s,d;
    cin>>s>>d;
  	reverse(s.begin(),s.end());
    if(s == d)
      cout<<"It is correct";
  else
    cout<<"It is wrong";
}