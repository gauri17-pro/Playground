#include<iostream>
using namespace std;
int main()
{
 int year, flag;
  cin>>year;
  if(year%4==0)
  {
    if(year%100==0)
    {
      if(year%400==0)
      {
        cout<<year<<" is a leap year";
      }
      else
      {
        cout<<year<<" is not a leap year";
      }
    }
    else
    {
      cout<<year<<" is a leap year";
    }
  }
  else
  {
    cout<<year<<" is not a leap year";
  }
}