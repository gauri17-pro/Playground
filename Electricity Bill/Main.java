#include<iostream>
using namespace std;
int main()
{
  int units, total;
  cin>>units;
  if(units<=200)
  {
    total = units*0.5;
  }
  else if(units<=400)
  {
    total = units*0.65 + 100;
  }
  else if(units<=600)
  {
    total = units*0.80 + 200;
  }
  else
  {
    total = units*1.25 + 425;
  }
  cout<<"Rs."<<total;
}