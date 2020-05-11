#include<iostream>
using namespace std;
int main()
{
  	string s;
    getline(cin,s);
    int v = 0, d = 0, c = 0, w = 0, sy = 0;
    for(int i = 0 ; s[i]!='\0' ; i++)
    {
        if(s[i]==' ' || s[i]=='\t' || s[i]=='\n')
        w++;
        if(isdigit(s[i]))
        d++;
        else if(isalpha(s[i]))
        {
            if((s[i]=='a') || (s[i]=='e') || (s[i]=='i') || (s[i]=='o') || (s[i]=='u') || (s[i]=='A') || (s[i]=='E') || (s[i]=='I') || (s[i]=='O') || (s[i]=='U'))
                    v++;
            else
                    c++;
        }
        else
           sy++;
      }
     cout<<"Vowels:"<<v<<endl<<"Consonants:"<<c<<endl<<"White Spaces:"<<w<<endl<<"Digits:"<<d<<endl<<"Symbols:"<<sy-w;
}