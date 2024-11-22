#include <iostream>
#include <cstring>


int firstIndex(char *sentence, char *substr){
    char* strptr;
    char* ssptr;
    int i =0;
    
    while(*sentence!='\0'){
        strptr = sentence;
        ssptr = substr;
        i++;
        
        while(*ssptr!='\0'){
            if(*ssptr!=*strptr){
                break;
            }
            strptr++;
            ssptr++;
        }
        
        if(*ssptr=='\0'){
            return i- 1;
        }
        
        sentence++;
    }
    
    return -1;
}


std::string replace(char *sentence, char *word, char *replacement){
    int firstIndexStr = firstIndex(sentence,word);
    if(firstIndexStr == -1){
        return std::string(sentence);
    }
    
    int wordlen = strlen(word);
    std::string result;
    
    while(firstIndexStr!= -1){
        sentence[firstIndexStr] = '\0';
        result+=std::string(sentence);
        result+=replacement;
        
        sentence += firstIndexStr+wordlen;
        firstIndexStr = firstIndex(sentence,word);
        
        
    }
    result+=std::string(sentence);
    return result;
}
int main() {
    char sentence[] = "This is a test. This is another test.";
    char word[] = "test";
    char replacement[] = "example";

    std::string result = replace(sentence, word, replacement);
    std::cout << "Result: " << result << std::endl; // Should print "This is a example. This is another example."
}
