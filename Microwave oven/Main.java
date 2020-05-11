#include<iostream>
using namespace std;
int main()
{
  float items, time, total;
  cin>>items>>time;
  if(items>3)
  {
    cout<<"Number of items is more";
  }
  else
  {
    if(items == 2)
  {
    total = time+0.5*time;
  }
  else if(items == 3)
  {
    total = 2*time;
  }
  else 
  {
    total = time;
  }
  printf("%.2f",total);

  }
 }