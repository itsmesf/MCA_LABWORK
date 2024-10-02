//Write a C++ program to find a string within a sentence and replace it with another string.

#include <iostream>
#include <string>
#include <algorithm>

std::string replaceStr(std::string sentence, const std::string& toFind,const std::string& toReplace){
    size_t pos = sentence.find(toFind); //size_t is unsigned long long int
    while(pos!=std::string::npos){
        sentence.replace(pos, toFind.length(), toReplace);
        pos = sentence.find(toFind, pos + toReplace.length());
    }

    return sentence;
}

std::string toLower(const std::string& str){
    std::string result = str;
    transform(result.begin(), result.end(), result.begin(),::tolower);
    return result;
}

int main(){

    std::string str, str_toFind, str_toReplace;

    std::cout << "Enter a sentence: ";
    getline(std::cin, str);

    std::cout << "Enter the string to find: ";
    getline(std::cin, str_toFind);

    std::cout << "Enter the string to replace: ";
    getline(std::cin, str_toReplace);

    std::cout << "\nModified Sentence: " << replaceStr(str, str_toFind, str_toReplace);

}


