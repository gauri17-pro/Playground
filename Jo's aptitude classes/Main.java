#include<iostream>
using namespace std;
int gcd(int a, int b)
{
  if(b==0)
    return a;
  else
    return gcd(b, a%b);
}
int main()
{
  int a, b, c, g, g1;
  cin>>a>>b>>c>>g;
  g1 = gcd(a,gcd(b,c));
  if(g==g1)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}