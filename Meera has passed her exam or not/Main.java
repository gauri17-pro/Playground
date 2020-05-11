#include<iostream>
using namespace std;
int main()
{
  int arr[100];
  int n,m;
  cin>>n;
  int flag = 0;
  for(int i = 0 ; i < n ; i++)
  {
    cin>>arr[i];
  }
  cin>>m;
  for(int i = 0 ; i < n ; i++)
  {
    if(m == arr[i])
    {
       flag = 1;
       break;
    }
  }
  if(flag == 1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}