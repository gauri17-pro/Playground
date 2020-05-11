#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num, first, last, sum;
  cin>>num;
  last = num%10;
  first = num/1000;
  sum = last+first;
  cout<<sum;
}