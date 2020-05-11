#include<iostream>
using namespace std;

int main()
{
  int choice, x1, y1, x2, y2;
  cin>>choice>>x1>>y1>>x2>>y2;
  int x3,y3;
  switch(choice)
  {
    case 1:
      x3 = x1 + x2;
      y3 = y1 + y2;
      break;
    case 2:
      x3 = x1 - x2;
      y3 = y1 - y2;
      break;
    case 3:
      x3 = x1*x2 - y1*y2;
      y3 = x1*y2 + x2*y1;
      break;
    default:
      cout<<"Invalid choice";
  }
  if(x3!=0 && y3!=0)
  if(y3<0)
  cout<<x3<<y3<<"i";
  else if(x3<0)
    cout<<x3<<"+"<<y3<<"i";
  else
    cout<<x3<<"+"<<y3<<"i";
}