#include <iostream>
int firstindexSubstr(char *sentence, char *substr){
    
    char *strPtr;
    char *ssPtr;
    int i = 0;
    
    while(*sentence!='\0'){
        strPtr = sentence;
        ssPtr =substr;
        i++;
        
        while(*ssPtr!='\0'){
            if(*strPtr!=*ssPtr){
                break;
            }
            strPtr++;
            ssPtr++;
        }
        
        if(*ssPtr == '\0'){
            return i-1;
        }
        sentence++;
    }
    
    return -1; // if no match is found;
    
}


int main(){
    char str[50], substr[50];
    
    std::cout << "Enter a sentence: ";
    std::cin.getline(str, 50);
    
    std::cout << "Enter substring to find its begining index: ";
    std::cin.getline(substr, 50);
    
    if (firstindexSubstr(str,substr) == -1){
        std::cout << "Substring not found";
    }
    
    else{
        std::cout <<"First Index: "  << firstindexSubstr(str,substr);
    }
}
