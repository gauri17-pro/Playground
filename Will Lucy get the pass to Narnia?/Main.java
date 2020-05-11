#include<iostream>
using namespace std;
int main()
{
  int a, b, c, option;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>option;
  switch(option)
  {
    case 1:
      c = a + b;
      cout<<c;
      break;
    case 2:
      c = a - b;
      cout<<c;
      break;
    case 3:
      c = a * b;
      cout<<c;
      break;
    case 4:
      c = a/b;
      cout<<c;
      break;
    case 5:
      c = a % b;
      cout<<c;
      break;
    default:
      cout<<"Invalid operation";
      
  }
  
}