#include<iostream>
using namespace std;
int main()
{
  int arr[100],even=0,odd=0;
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i = 0 ; i < n ; i++)
  {
    cin>>arr[i];
    if(arr[i]%2==0)
      even += 1;
    else
      odd += 1;
  }
  if(odd!=0 && even!=0)
    cout<<"The array is Mixed";
  if(odd==0)
    cout<<"The array is Even";
  if(even==0)
    cout<<"The array is Odd";
  return 0;
}