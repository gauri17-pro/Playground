#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n, male = 0 , female = 0; 
  cin>>n;
  int *ptr;
  ptr =new int[n];
  for(int i = 0 ; i < n ; i++)
  {
    cin>>ptr[i];
    if(ptr[i]%2==0)
      female++;
    else
      male++;
  }
  cout<<male<<"\n"<<female;
  
  return 0;
}