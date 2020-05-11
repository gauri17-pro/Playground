#include<iostream>
#include<math.h>
using namespace std;
int countDigit(int n)
{
  int cnt = 0;
  while(n!=0)
  {
    n=n/10;
    cnt++;
  }
  return cnt;
}
int main()
{
  int n,n1,n2,n1_cnt,squ,squ_cnt,total;
  cin>>n;
  n1_cnt = countDigit(n);
  squ = pow(n,2);
  n1 = squ%((int)pow(10,n1_cnt));
  n2 = squ/((int)pow(10,n1_cnt));
  total = n1+n2;
  if(total == n)
 	cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}