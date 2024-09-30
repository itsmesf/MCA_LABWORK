//Length of string using pointers

#include <iostream>

int main(){
    std::string s;
    std::cout << "Enter a string: ";
    getline(std::cin, s);
    std::string *ptr = &s;

    std::cout << "Length of entered string: " << ptr ->length();
}