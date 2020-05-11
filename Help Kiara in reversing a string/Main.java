#include <iostream>
#include <cstring>
#include <cstdlib>
using namespace std;
int main()
{
  char str[100], rev[100];     
  int count = 0, end, i;    
  cin.getline(str,100);
  end = 0;
  for(int i = 0 ; str[i]!='\0' ; i++)
    end++;
  for(int i = end-1 ; i >= 0 ; i--)
    cout<<str[i];
}