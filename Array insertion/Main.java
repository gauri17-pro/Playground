#include<iostream>
using namespace std;
int main()
{
  int n, arr[100],pos,val;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i = 0 ; i < n ; i++)
  {
    cin>>arr[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>pos;
  if(pos<=n)
  {
    pos-=1;
    cout<<"Enter the value to insert\n";
    cin>>val;
    for(int i = n ; i >= pos ; i-- )
    {
        arr[i+1] = arr[i];
    }
    arr[pos]=val;
    cout<<"Array after insertion is\n";
    for(int i = 0 ; i < n+1 ; i++)
    {
      cout<<arr[i]<<endl;
    }
  }
  else
  {
    cout<<"Invalid Input";
  }
}