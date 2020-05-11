#include<iostream>
using namespace std;
int main()
{
  int max_weight, adult, child, total;
  cin>>max_weight>>adult>>child;
  total = adult*75 + child*30;
  if(total<max_weight)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}