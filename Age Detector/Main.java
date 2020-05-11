#include<iostream>
using namespace std;
int main()
{
  int birth, curr, age;
  cin>>birth>>curr;
  if(birth>curr)
  {
    age = (100 - birth) + curr;
  }
  else
  {
    age = curr-birth;
  }
  cout<<age;
}