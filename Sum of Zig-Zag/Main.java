#include<iostream>
using namespace std;
int sumZigZag(int n, int m, int **p)
{
  int sum = 0;
    for(int i = 0 ; i < n ; i++)
    {
        if(i==0 || i==n-1)
            for(int j = 0 ; j < m ; j++)
            {
                sum += p[i][j];
            }
        else
        sum+=p[i][m-1-i];
    }
    return sum;
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
    cout<<"Sum of Zig-Zag pattern is "<<sumZigZag(n,m,p);
}