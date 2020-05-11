#include<iostream>
using namespace std;
int main()
{
  int encrypt, entered, num, sum;
  cin>>encrypt>>entered;
  num = encrypt + entered;
  sum = 0;
  for(int i = 1 ; i < num ; i++)
  {
    if(num%i==0)
    {
      sum+=i;
    }
  }
  if(sum == num)
  {
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }
}