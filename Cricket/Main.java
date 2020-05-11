#include <iostream>

using namespace std;

float round(float var) 
{ 
    char str[40];  
    sprintf(str, "%.1f", var); 
    sscanf(str, "%f", &var);  
    return var;  
} 

int main()
{
  float balls, runs, score;
  int bowled;
  cin>>balls>>runs>>score>>bowled;
  float overs, overs_f,curr,total;
  overs = balls/6;
  overs_f = bowled/6 + 0.1*(bowled%6);
  curr = runs/overs;
  total = (score/overs_f);
  cout<<overs<<"\n"<<overs_f<<"\n"<<round(total)<<"\n"<<round(curr)<<"\n";
  if(total>curr)
  {
    cout<<"Eligible to Win"<<endl;
  }
  else
  {
    cout<<"Not Eligible to Win"<<endl;
  }
}
