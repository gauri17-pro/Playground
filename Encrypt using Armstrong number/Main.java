#include<iostream>
#include<math.h>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int count(int n)
{
  int cnt = 0;
  while(n!=0)
  {
    n = n/10;
    cnt++;
  }
  return cnt;
}
int arm(int n)
{
  int p,rem,sum=0,temp=n;
  p = count(n);
   while(n!=0)
   {
     rem = n%10;
     sum += power(rem,p);
     n = n/10;
   }
  if(sum == temp)
      return 1;
  else
   return 0;
}
int main()
{
    int n;
    cin>>n;
    if(arm(n)==1)
        cout<<"Kindly proceed with encrypting";
    else
        cout<<"It is not an Armstrong number";
    
}