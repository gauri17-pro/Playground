#include <iostream>

using namespace std;


void eraseAllSubStr(std::string & mainStr, const std::string & toErase)
{
	size_t pos = string::npos;
 
	// Search for the substring in string in a loop untill nothing is found
	while ((pos  = mainStr.find(toErase) )!= string::npos)
	{
		// If found then erase it from string
		mainStr.erase(pos, toErase.length()+1);
	}
}

int main()
{
   string s;
   getline(cin,s);
   eraseAllSubStr(s,"the");
   cout<<s;
   return 0;
}