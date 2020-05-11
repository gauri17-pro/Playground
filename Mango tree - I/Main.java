#include<iostream>
using namespace std;
int main()
{
  int rows, columns, number, num;
  cin>>rows>>columns>>number;
  int arr[rows][columns];
  num = 1;
  for(int i = 0 ; i < rows ; i++)
  {
    for(int j = 0 ; j < columns ; j++)
    {
      arr[i][j] = num;
      num+=1;
    }
  }
  int flag = 0;
  for(int i = 0 ; i < rows ; i++)
  {
    for(int j = 0 ; j < columns ; j++)
    {
      if(arr[i][j] == number)
      {
        if((i == 0) || (j==0) || (j==columns-1))
        {
          flag = 1;
          break;
        }
      }
    }
    if(flag == 1)
      break;
  } 
  if(flag == 1)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}