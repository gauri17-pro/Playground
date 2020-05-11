#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n1,num,n=1,sq;
  cin>>num;
  n1 = num;
  sq = pow(num,2)+1;
  for(int i = 0 ; i < num ; i++)
  {
    for(int j = 0 ; j < 2*i ; j++)
    {
      cout<<"-";
    }
    for(int j = 0 ; j < n1 ; j++)
    {
      cout<<n<<"*";
      n+=1;
    }
    for(int j = 0 ; j < n1 ; j++)
    {
      if(j!=n1-1)
      cout<<sq<<"*";
      else
        cout<<sq;
      sq+=1;
    }
    sq = sq - (num*2-1-i*2);
    n1-=1;
    cout<<endl;
  }
}