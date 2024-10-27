#include<iostream>

void deleteChars(char *str, int nChar, int pos, char *result){
    
    int i = 0;
    while(i<pos){
        *result = *str;
        i++;
        str++;
        result++;
    }
    
    str+=nChar;
    
    while(*str!='\0'){
        *result = *str;
        result++;
        str++;
    }
    
    *result = '\0';
}




int main(){
    char str[50], result[50];
    char *ptr = result;
    
    int n, pos;
    std::cout << "Enter a string: ";
    std::cin.getline(str, 50);
    
    std::cout << "Enter number of characters to be deleted: ";
    std::cin >> n;
    
    std::cout << "Enter position from where characters are to be deleted: ";
    std::cin >> pos;
    
    deleteChars(str, n, pos, result);
    
    while(*ptr!='\0'){
        std::cout << *ptr;
        ptr++;
    }
}
