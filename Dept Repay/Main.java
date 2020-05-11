#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 int p,roi,n;
  cin>>p>>roi>>n;
 float si,amount,discount,final_s,after_discount;
  si = (p*roi*n)/100;
  amount = p+si;
  discount = 0.02;
  after_discount = si*discount;
  final_s = amount - after_discount;
  cout<<si<<endl
    <<amount<<endl
    <<after_discount<<endl
    <<final_s<<endl;
}