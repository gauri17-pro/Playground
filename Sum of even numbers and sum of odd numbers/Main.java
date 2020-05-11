#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int n,even = 0,odd = 0;
  cin>>n;
  int *ptr = new int[n];
  for(int i = 0 ; i < n ; i++)
  {
    cin>>ptr[i];
    if(ptr[i]%2==0)
      even += ptr[i];
    else
      odd += ptr[i];
  }
  cout<<"The sum of the even numbers in the array is "<<even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<odd;
}