#include<iostream>
using namespace std;
int MAX(int* a)
{
    int max = -1,a1;
    int n = sizeof(a)/sizeof(int)+1;
    for(int i = 0 ; i < n ; i++)
    if(a[i]>max)
     {
         max = a[i];
         a1 = i+1;
     }
    return a1;
}
int main()
{
    int n, m;
    cin>>n>>m;
    int **p = new int*[n];
    for(int i = 0 ;i < n ; i++)
    p[i] = new int[m];
    for(int i = 0 ; i < n ; i++)
    {
        for(int j = 0 ; j < m ; j++)
        cin>>p[i][j];
    }
    int *sum = new int[n];
    int *sum1 = new int[m];
    cout<<"Sum of rows is ";
    for(int i = 0 ; i < n ; i++)
    {
        sum[i] = 0;
        for(int j = 0 ; j < m ; j++)
        {
            sum[i]+=p[i][j];
        }
        cout<<sum[i]<<" ";
    }
    int mr = MAX(sum);
    cout<<"\nRow "<<mr<<" has maximum sum";
    cout<<"\nSum of columns is ";
    for(int j = 0 ; j < m ; j++)
    {
        sum1[j]=0;
        for(int i = 0 ; i < n ; i++)
        {
            sum1[j]+=p[i][j];
        }
        cout<<sum1[j]<<" ";
    }
    int mc = MAX(sum1);
    cout<<"\nColumn "<<mc<<" has maximum sum";
}