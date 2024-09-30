//C++ program to count vowels using a pointer

#include <iostream>
#include <string>

using namespace std;

int main(){
   string s; int count = 0;
   cout << "Enter a string: ";
   getline(cin, s);
   string *ptr = &s;

   for (char ch : *ptr){
       ch = tolower(ch);
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
           count++;
       }
   }

   cout << "Vowel count: " << count;
}

