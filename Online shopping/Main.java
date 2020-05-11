#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int f_a, f_d, f_c, s_a, s_d, s_c, a_a, a_d, a_c;
  cin>>f_a>>f_d>>f_c>>s_a>>s_d>>s_c>>a_a>>a_d>>a_c;
  float flip,snap,amaz;
  string s;
  flip = f_a-(f_a*f_d/100)+f_c;
  snap = s_a-(s_a*s_d/100)+s_c;
  amaz = a_a-(a_a*a_d/100)+a_c;
  if(flip>snap)
  {
    if(amaz<snap)
    {
      s = "Amazon";
    }
    else
    {
      s = "Snapdeal";
    }
  }
  else
  {
    if(flip>amaz)
    {
      s = "Amazon";
    }
    else
    {
      s = "Flipkart";
    }
  }
  cout<<"In Flipkart Rs."<<flip<<endl;
  cout<<"In Snapdeal Rs."<<snap<<endl;
  cout<<"In Amazon Rs."<<amaz<<endl;
  cout<<"He will prefer "<<s;  
}