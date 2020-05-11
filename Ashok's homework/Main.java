#include<iostream>
using namespace std;
int main()
{
  int n,m;
  int a[100][100], b[100][100];
    cin>>n>>m;
  for(int i = 0 ; i < n ; i++)
  {
    for(int j = 0 ; j < m ; j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i = 0 ; i < n ; i++)
  {
    for(int j = 0 ; j < m ; j++)
    {
      cin>>b[i][j];
    }
  }
  int c[100][100];
  for(int i = 0 ; i < n ; i++)
  {
    for(int j = 0 ; j < m ; j++)
    {
      c[i][j] = a[i][j] + b[i][j];
      cout<<c[i][j]<<" ";
    }
    cout<<"\n";
  }
}