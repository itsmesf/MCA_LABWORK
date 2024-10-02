//Write a C++ program to determine if the given string is a palindrome or not.

#include <iostream>

std::string newString(std::string str){
    std::string new_str = "";
    for(int i = 0; i < str.length();i++){
        char c = tolower(str[i]);
        int ascii = c;
        if(ascii >=97 && ascii <=122){
            new_str+=c;
        }
    }
    return new_str;
}

std::string revStr(std::string str){
    std::string new_str = newString(str);
    std::string rev = "";
    for(int i = new_str.length()-1; i >= 0; i--){
        rev+= new_str[i];
    }
    return rev;
}

bool isPalindrome(std::string str){
    std::string s = newString(str) , rev = revStr(str);
    return (s==rev);
}

int main(){
    std::string str;
    std::cout << "Enter a string: ";
    getline(std::cin, str);

    (isPalindrome(str))?std::cout << "\nString is Palindrome" : std::cout << "\nString is not Palindrome";

   return 0;
}