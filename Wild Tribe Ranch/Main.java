#include<iostream>
using namespace std;
int main()
{
  int max,weight;
  cin>>max>>weight;
  if(weight<max)
  {
    cout<<"Yes, you can enter.";
  }
  else if(weight == max)
  {
    cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    cout<<"Sorry, you can't enter";
  }

}