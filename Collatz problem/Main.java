#include<iostream>
using namespace std;
int main()
{
  int n,cnt;
  cin>>n;
  cout<<n<<endl;
  while(n!=1)
  {
    if(n%2==0)
    {
      n = n/2;
      cnt++;
    }
    else
    {
       n = 3*n+1;
      cnt++;
    }
    cout<<n<<endl;
  }
  cout<<cnt;
}