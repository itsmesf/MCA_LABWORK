#include <iostream>

int firstindexSubstr(char *sentence, char s, char e){
    
    char *strPtr;
    
    int i = 0;
    
    while(*sentence!='\0'){
        strPtr = sentence;
        i++;
        
        if(*strPtr == s){
         while(*strPtr != e){
             strPtr++;
            }
            return i-1;
        }
        sentence++;
    }
    
    return -1; // if no match is found;
    
}

void findSubStr(char *str, char s, char e, char *result){
    
    int firstIndex = firstindexSubstr(str, s, e);
    int i = 0;
    
    while(i<firstIndex){
        i++;
        str++;
    }
    
    while(*str!=e){
        *result = *str;
        str++;
        result++;
    }
    
    *result+=e;
    *result='\0';
}



int main(){
    char str[50] , result[50];
    char s, e;

    std::cout << "Enter a sentence: ";
    std::cin.getline(str, 50);

    std::cout << "Enter first and last characters: ";
    std::cin >> s >> e;
    
    findSubStr(str, s, e, result);
    // Output the result
    std::cout << "Resulting sentence: " << result << std::endl;

    return 0;
}
