//display concatenated string using pointers(char arrays)

#include<iostream>

void concatStr(char *str1, const char *str2){

    while (*str1!='\0'){
        str1++;
    }

    while(*str2 !='\0'){  //swapping takes place till middle character(index)
        *str1 = *str2;
        str1++;
        str2++;
    }

    *str1 = '\0';
}


int main(){

    char str1[100];
    char str2[50];

    std::cout << "Enter first string: ";
    std::cin.getline(str1, 50);

    std::cout << "Enter second string: ";
    std::cin.getline(str2, 50);

    concatStr(str1,str2);

    std::cout << "Concatenated string: "  << str1;

    return 0;
}
