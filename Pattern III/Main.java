#include<iostream>
using namespace std;
int main()
{
  int num,n=1;
  cin>>num;
  for(int i = 0 ; i < num ; i++)
  {
    int c = 0;
    for(int j = 0 ; j <= i ; j++)
    {
      cout<<n;
      if(c<i)
      {
        cout<<"*";
        c++;
      }
    }
    n+=1;
    cout<<endl;
  }
  n-=1;
  for(int i = 0 ; i < num ; i++)
  {
    int c = n-1;
    for(int j = n ; j > 0 ; j--)
    {
      cout<<n;
      if(c>0)
      {
        cout<<"*";
        c--;
      }
    }
    n-=1;
    cout<<endl;
  }
  
}