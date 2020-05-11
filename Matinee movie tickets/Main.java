#include<iostream>
using namespace std;
int main()
{
  int age;
  float time, amount;
  cin>>age>>time;
  if(age>13)
  {
    if(time<12.00 && time>6.00)
    {
      amount = 8.00;
    }
    else
    {
      amount = 5.00;
    }
  }
  else
  {
    if(time<12.00 && time>6.00)
    {
      amount = 4.00;
    }
    else
    {
      amount = 2.00;
    }
  }
  printf("$%.2f",amount);
}