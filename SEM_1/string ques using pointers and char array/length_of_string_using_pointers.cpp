//display length of string using pointers(char arrays)

#include<iostream>

int lenStr(const char *str){
    int count = 0;
    while(*str!='\0'){
        str++;
        count++;
    }
    return count;
}

int main(){

    char str[50];
    std::cout << "Enter a string: ";
    std::cin.getline(str, 100);

    std::cout << "Length of the string: " << lenStr(str);
}
