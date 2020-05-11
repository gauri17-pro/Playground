#include<iostream>
using namespace std;
int main()
{
  int n, m;
  cin>>n>>m;
  int **p = new int*[n];
  for(int i = 0 ; i < n ; i++)
  p[i] = new int[m];
  int max = -1;
  for(int i = 0 ; i < n ; i++)
    for(int j = 0 ; j < m ; j++)
    {
      cin>>p[i][j];
      if(p[i][j]>max)
        max = p[i][j];
    }
  cout<<"The maximum element is "<<max;
}