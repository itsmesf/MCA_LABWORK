/*Write a C++ program that displays the position or index in the string S where
the string T begins, or 1 if S doesn’t contain T.*/

#include <iostream>
#include <string>
#include <algorithm>

std::string toLower(std::string& str){
    std::string result = str;
    transform(result.begin(), result.end(), result.begin(), ::tolower);
    return result;
}

int indexStr(std::string& sentence, std::string& toFind){
    std::string str = toLower(sentence), str_toFind = toLower(toFind);
    if(!str.find(str_toFind)){
        return 0;
    }

    return str.find(str_toFind);
}

int main(){
    std::string str, str_toFind;

    std::cout << "Enter a sentence: ";
    getline(std::cin, str);

    std::cout << "Enter a substring to be searched in an string: ";
    getline(std::cin, str_toFind);

    (indexStr(str, str_toFind)== -1)?std::cout << "1 : String is not contained in a sentence" :  std::cout << "Index of string where substring begins: " << indexStr(str, str_toFind);

}