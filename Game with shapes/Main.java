
  #include<iostream>
using namespace std;
int main()
{
  int radius, side;
  cin>>radius>>side;
  float d,as;
  d = 2*radius;
  as = side*side;
  if(d>side)
  {
    cout<<"circle cannot be inside a square";
  }
  else
  {
   cout<<"circle can be inside a square"; 
  }
}