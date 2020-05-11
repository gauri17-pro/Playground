#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int dollar,cents;
  dollar = d1 + d2;
  cents = c1 + c2;
  if(cents > 100)
  {
    dollar += cents/100;
    cents = cents%100;
  }
  cout<<dollar<<endl<<cents;
}