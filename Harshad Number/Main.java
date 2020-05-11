#include<iostream>
using namespace std;
int main()
{
  int n, sum=0, num;
  cin>>n;
  num = n; 
  while(n!=0)
  {
    sum += n%10;
    n = n/10;
  }
  if(num%sum == 0)
  cout<<"Harshad Number";
  else
 	cout<<"Not Harshad Number";
}