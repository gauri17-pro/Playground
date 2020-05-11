#include<iostream>
using namespace std;
int main()
{
  float mileage, petrol,distance,d1;
  cin>>mileage>>petrol>>distance;
  d1 = mileage*petrol;
  if(d1<distance)
  {
  	cout<<"Cannot reach";
  }
  else
  {
  	cout<<"Can reach";
  }
}