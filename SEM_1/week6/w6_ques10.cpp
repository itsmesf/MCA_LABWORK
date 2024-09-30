//Write C++ program to reverse string using pointers

#include <iostream>
#include <string>


int main(){

    std::string s;
    std::cout << "Enter a string: ";
    getline(std::cin,s);

    std::string *ptr = &s;

    for (int i = ptr->length() ; i > 0 ; i--){   
        std::cout << (*ptr)[i-1];
    }

    return 0;
}

