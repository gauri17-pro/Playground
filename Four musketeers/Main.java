#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x1,x2,x3,y1,y2,y3;
  float x,y;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  x = float((x1+x2+x3)/3);
  y = float((y1+y2+y3)/3);
  cout<<x<<endl<<y;
}