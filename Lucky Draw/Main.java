#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n, flag = 0;
  cin>>n;
  for(int i = 2; i < sqrt(n) ; i++)
  {
    if(n%i==0)
    {
      flag = 0;
       break;
    }
    else
      flag = 1;
  }
  if(flag == 1)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
    
}