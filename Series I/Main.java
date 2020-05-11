#include<iostream>
using namespace std;
int main()
{
  float start = 0.5;
  float n,temp;
  cin>>n;
  temp = start;
  cout<<start<<" ";
  for(int i = 1 ; i < n ; i++)
  {
    temp = temp*3;
    cout<<temp<<" ";
  }
}