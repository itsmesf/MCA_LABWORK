//Displaying string using pointers

/*c_str() function he c_str() function in C++ converts a string to an array of
characters and terminates this array with a null character at the end.*/

#include <iostream>
#include <string>

int main(){
   std::string str;

   std::cout << "Enter you String: ";
   getline(std::cin, str);

   const char *ptr = str.c_str();

   std::cout << "Your entered String: " << ptr;
}