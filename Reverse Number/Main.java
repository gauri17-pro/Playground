#include <iostream>
using namespace std;
int main() 
{
   int n,rem = 0,num;
   cin>>n;  
  while(n!=0)
  {
    rem = rem + n%10;
    rem = rem * 10;
    n = n/10;
  }
  cout<<rem/10;
	return 0;
}