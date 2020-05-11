#include<iostream>
using namespace std;
int main()
{
    int m;
    cin>>m;
    int **p = new int*[5];
    for(int i = 0 ; i < 5 ; i++)
    p[i] = new int[m];
    for(int i = 0 ; i < 5 ; i++)
    {
        for(int j = 0 ; j < m ; j++)
        {
            cin>>p[i][j];
        }
    }
    int fw = 0, bw = 0;
    for(int i = 0 ; i < 5 ; i++)
    {
        for(int j = 0 ; j < m ; j++)
        {
            if(i==j)
            fw+=p[i][j];
        }
    }
    int cn = m - 1; 
    for(int i = 0 ; i < 5 ; i++)
    {
        if(cn>=0)
        bw += p[i][cn--];
    }
    if(bw == fw)
    cout<<"Yes";
    else
    cout<<"No";
}