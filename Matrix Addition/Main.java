#include <iostream>
#include<cstdlib>
using namespace std;
int** createArray(int n , int m)
{
   int** a = new int*[n];
   for(int i = 0 ; i < n ;i++ )
        a[i] = new int[m];
    for(int i = 0 ; i < n ; i++)
    {
        for(int j = 0 ; j < m ; j++)
        {
            cin>>a[i][j];
        }
    }
    return a;
}
int getElement(int **a, int i , int j)
{
    int s = a[i][j];
    return s;
}
int addMatrix(int**c,int **a, int **b, int n , int m)
{
    for(int i = 0 ; i < n; i ++)
    {
        for(int j = 0 ; j < m ; j++)
        {
            c[i][j] = getElement(a,i,j) + getElement(b,i,j);
            cout<<c[i][j]<<" ";
        }
        cout<<"\n";
    }
    return 1;
}
int main()
{
   int n, m;
   cin>>n>>m;
   int ** a = createArray(n,m);
   int ** b = createArray(n,m);
   int** c = new int*[n];
   for(int i = 0 ; i < n ;i++ )
        c[i] = new int[m];
   addMatrix(c,a,b,n,m);
}