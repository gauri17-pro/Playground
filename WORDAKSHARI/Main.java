#include <iostream>
#include<string>
#include<cstdlib>
using namespace std;

int main()
{
  string s[100];
  string d;
  int i = 0;
  while(1)
  {
      getline(cin,d);
      if(d=="####")
      {
          break; 
      }
      else
      s[i].assign(d);
      i++;
      
  }
  cout<<s[0]<<endl;
  for(int k = 0; k < i ; k++)
  {
      if(s[k][s[k].size()-1]==s[k+1][0])
      {
          cout<<s[k+1]<<endl;
      }
  }
}