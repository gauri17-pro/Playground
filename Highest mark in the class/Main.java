#include<iostream>
using namespace std;
int main()
{
 int n;
  cin>>n;
  int arr[100];
  int max = 0;
  for(int i =0 ; i < n ; i++)
  {
    cin>>arr[i];
  }
 for(int i =0 ; i < n ; i++)
  {
    if(arr[i]>max)
      max = arr[i];
  } 
  cout<<max;
}