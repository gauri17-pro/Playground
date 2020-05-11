#include<iostream>
#include<vector>
using namespace std;
int main()
{
  int a, b, c, sl;
  cin>>a>>b>>c;
    if(a >= b && a >= c)
    {
        if(b >= c)
        {
             sl = b;
        }
        else
        {
            sl = c;
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            sl = a;
        }
        else
        {
            sl =c;
        }
    }
    else if(a >= b)
    {
        sl =a;
    }
     else
     {
         sl = b;
     }
    int com=1;
    if(a%b==0 && c%b==0)
    {
      com = b;
    }
    if(b%a == 0 && c%a == 0)
    {
      if(a>com)
        com = a;
    }
    if(a%c == 0 && b%c == 0)
    {
      if(c>com)
        com = c;
    }
    cout<<"The treasure is in box which has number "<<sl<<endl;
    cout<<"The code to open the box is "<<com<<endl;
}