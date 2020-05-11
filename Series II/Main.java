#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n, start;
  cin>>n;
  start = 11;
  for(int i = 1; i <= n; i++)
  {
    cout<<pow(start,2)<<" ";
    start += 4;
  }
}