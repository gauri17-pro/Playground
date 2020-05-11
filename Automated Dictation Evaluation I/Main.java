#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s1[50], s2[50];
  cin>>s1>>s2;
  if(strcmp(s1, s2) == 0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}