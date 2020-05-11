#include<iostream>
using namespace std;
int main()
{
  int n1;
  cin>>n1;
  int n = 1;
  for(int i = 0 ; i < n1 ; i++)
  {
    if(i%2 == 0)
    {
       int c = 0;
      for(int j = 0 ; j < i+1 ; j++)
      {
        cout<<n;
        if(c<i)
        {
          cout<<"*";
          c++;
        }
        n += 1;
      }
      n-=1;
      cout<<endl;
    }
    else
    {
      int num = n + i + 1;
      n = num;
      int c =0;
      for(int j = 0 ; j < i+1 ; j++)
      {
        cout<<n;
        if(c<i)
        {
          cout<<"*";
          c++;
        }
        n-=1;
      }
      n = num + 1;
      cout<<endl;
    }
  }
}