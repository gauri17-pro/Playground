#include<iostream>
using namespace std;
int main()
{
  int n, temp;
  cin>>n;
  int even = 0, odd = 0;
  while(n!=0)
  {
    temp = n%10;
    if(temp%2==0)
      even += temp;
    else
      odd += temp;
    n = n/10;
  }
  if(even == odd)
    cout<<"Yes";
  else
    cout<<"No";
}