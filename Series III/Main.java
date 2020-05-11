#include<iostream>
using namespace std;
int main()
{
  int n, start;
  cin>>n;
  start = 6;
  for(int i=1; i<=n ; i++)
  {
    cout<<start<<" ";
    start += 5*i;
  }
}