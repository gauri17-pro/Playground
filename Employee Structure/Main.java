#include<iostream>
#include<string>
using namespace std;
struct emp
{
  string name;
  int id;
  int age;
  string des;
  int sal;
};
int main()
{
 struct emp e;
  cout<<"Enter name:\n";
 getline(cin,e.name);
  cout<<"Enter ID:\n";
  cin>>e.id;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin.ignore();
  getline(cin,e.des);
  cout<<"Enter Salary:\n";
  cin>>e.sal;
  cout<<"Employee Details\nName of the Employee : "<<e.name<<"\nID of the Employee : "<<e.id<<"\nAge of the Employee : "<<e.age<<"\nDesignation of the Employee : "<<e.des;
  printf("\nSalary of the Employee : %d",e.sal);
}