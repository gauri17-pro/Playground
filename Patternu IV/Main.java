#include <iostream>
using namespace std;
int main() {
    int num, n=1 ; 
  	cin>>num;
  for(int i = 0 ; i < num ; i++)
  {
    if(i%2 == 0)
    {
      for(int j = 0; j < num-1 ; j++)
        cout<<n;
      n+=1;
      cout<<n<<endl;
    }
    else
    {
      n+=1;
      cout<<n;
      for(int j = 0 ; j < num-1;j++)
      {
        cout<<n-1;
      }
      cout<<endl;
    }
  }
    return 0;
}