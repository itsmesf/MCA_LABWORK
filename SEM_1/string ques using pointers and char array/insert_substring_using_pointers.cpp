#include<iostream>
void insertSubstr(char *str, char *subStr, int pos, char *result){
    
    int i =0;
    
    while(i < pos && *str!='\0'){
        *result = *str;
        str++;
        result++;
        i++;
    }
    
    while(*subStr!='\0'){
        *result = *subStr;
        result++;
        subStr++;
    }
    
    while(*str!='\0'){
        *result = *str;
        str++;
        result++;
    }
    
    *result = '\0';
    
}

int main(){
    char str[50], subStr[50], result[100];
     int pos;
     
     
     std::cout << "Enter a string: ";
     std::cin.getline(str, 50);
     
     std::cout << "Enter a Sub string: ";
     std::cin.getline(subStr, 50);
     
     std::cout << "Enter a position where substring is to be inserted: ";
     std::cin >> pos;
     
     insertSubstr(str, subStr, pos, result);
     char *resPtr = result;
     while(*resPtr!='\0'){
         std::cout <<*resPtr;
         resPtr++;
     }
     
    return 0; 
}
