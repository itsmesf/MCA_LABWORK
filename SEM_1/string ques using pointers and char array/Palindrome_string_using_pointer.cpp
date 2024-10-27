#include<iostream>

void cleanStr(char *str){
	char* writePtr = str;
	while(*str!='\0'){
	*str = tolower(*str);
    if(*str>='a' && *str<='z'){
    	*writePtr = *str;
    	writePtr++;
		}
	str++;
	}
	*writePtr = '\0';
}

void reverseStr(char *str, char* rev){
	char *end = str;
	
	while(*end!='\0'){
		end++;
	}
	end--;
	
	while(end>=str){
	    *rev = *end;
	     rev++;
	     end--;
	}
	
	*rev = '\0';
	
}

bool isPalindromeStr(char *str){
    char reversed[50];
    reverseStr(str, reversed);
    char *rev = reversed;
    while(*str!='\0' && *rev != '\0'){
        if(*str!=*rev){
            return false;
        }
        str++;
        rev++;
    }
    
    return true;
    
}
int main(){
	char str[50];
	std::cout << "Enter a string: ";
	std::cin.getline(str, 50);
	cleanStr(str);
	
	(isPalindromeStr(str))?std::cout << "String is Palindrome" : std::cout << "String is not Palindrome";;
    
	return 0;
}
