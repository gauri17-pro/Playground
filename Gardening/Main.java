#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c, r;
  cin>>a>>b>>c;
  r = c % 3;
  if(r!=0)
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }
}