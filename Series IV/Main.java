#include<iostream>
using namespace std;
int main()
{
  int n, c=6, cnt = 0;
  cin>>n;
  int f=0, s=2;
  if(n <= 2)
  {
    if(n==1)
      cout<<f<<" ";
    if(n==2)
      cout<<f<<" "<<s<<" ";
  }
  else
  {
    cout<<f<<" "<<s<<" ";
    for(int i=2 ; i<n ; i++)
    {
      s += c;
      cout<<s<<" ";
      cnt++;
      if(cnt==2)
      {
        cnt=0;
        c += 4;
      }
    }
  }
  
}