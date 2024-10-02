/*Write a C++ program that uses functions to perform the following operations:
i. To insert a sub string into a given main string from a given position.
ii. To delete n characters from a given position in a given string.*/

#include <iostream>

std::string subStr_insert(std::string str, std::string subStr, int pos) {

    std::string new_str = "";
    for(int i = 0; i < (str.length()+subStr.length()); i++){
        if(i < pos){
            new_str+=str[i];
        }
        else if( i >=pos && i < pos + subStr.length()){
            new_str +=subStr[i-pos];
        }
        else{
            new_str+=str[i-subStr.length()];
        }
    }

    //alternatively, we can use substr to break the original string into two parts and insert the new substring
    //    std::string result = str.substr(0, pos) + substr + str.substr(pos);

    return new_str;

}

std::string delete_str_char(std::string str, int nChar, int pos) {
    std::string new_str= "";

    for(int i = 0; i < (str.length()-nChar) ; i++){
        if(i < pos){
            new_str+=str[i];
        }
        else{
            new_str+=str[i+nChar];
        }
    }

    return new_str;

}

int main(){

    std::string str;
    int pos;

    int sw;
    std::cout << "Select '1' to INSERT SUBSTRING and '2' to DELETE n CHARACTERS FROM STRING:    ";
    std::cin >> sw;
    std::cin.ignore();

    switch(sw){
        case 1:{
            std::string subStr;

            std::cout << "\nEnter a string: ";
            getline(std::cin, str);

            std::cout << "Enter a substring to be inserted in an String: ";
            getline(std::cin, subStr);

            std::cout << "Enter position where the sub string is to be inserted: ";
            std::cin >> pos;

            std::cout << "\nResultant String: " << subStr_insert(str, subStr, pos);

            break;
        }

        case 2:{

            int nChar;

            std::cout << "\nEnter a string: ";
            getline(std::cin, str);

            std::cout << "Enter number of characters deleted from a string: ";
            std::cin >> nChar;

            std::cout << "Enter position where the characters is to be deleted: ";
            std::cin >> pos;

            std::cout << "\nResultant String: " << delete_str_char(str, nChar, pos);

            break;

        }
        default: {
            std::cout << "Wrong input...";
        }
    }

    return 0;
}
