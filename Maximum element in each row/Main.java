#include<iostream>
using namespace std;
int main()
{
  int n, m, max;
    cin>>n>>m;
    int **p = new int*[n];
    for(int i = 0 ;i < n ; i++)
    p[i] = new int[m];
    for(int i = 0 ; i < n ; i++)
    {
        for(int j = 0 ; j < m ; j++)
        cin>>p[i][j];
    }
  for(int i = 0 ; i < n ; i++)
  {
    max = -1;
    for(int j = 0 ; j < m ; j++)
    {
      if(p[i][j]>max)
        max = p[i][j];
    }
    cout<<max<<endl;
  }
}