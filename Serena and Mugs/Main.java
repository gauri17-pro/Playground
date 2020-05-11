#include<iostream>
using namespace std;
int printresult(int *p, int n, int s)
{
  int sum = 0;
  for(int i = 0 ; i < n ; i++)
    sum+=p[i];
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
  return 1;
}
int main()
{
  int n, s;
  cin>>n>>s;
  int *p = new int[n];
  for(int i = 0 ; i < n ; i++)
    cin>>p[i];
  printresult(p, n, s);
}