#include<iostream>
using namespace std;
bool isPerfect(int n)
{
  int sum  = 0;
  for(int i = 1; i < n;i++)
  {
    if(n%i == 0)
      sum+=i;
  }
  if(sum == n)
    return 1;
  else
    return 0;
}
int main()
{
  int start,end;
  cin>>start>>end;
  for(int i = start ; i <= end ; i++)
  {
    if(isPerfect(i))
      cout<<i<<" ";
  }
}