#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int days;
  days = n + (int)sqrt(n) + 1;
  cout<<days;
}