#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,req,exp;
  cin>>m>>n>>req;
  exp = pow(m, n);
  if(req <= exp)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}