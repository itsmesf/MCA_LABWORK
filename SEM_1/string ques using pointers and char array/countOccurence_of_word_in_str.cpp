#include <iostream>

int firstIndexSubstr(char *sentence, char *substr){
    
    char *strptr;
    char *ssptr;
    int i = 0;
    
    while(*sentence!='\0'){
        strptr = sentence;
        ssptr = substr;
        i++;
        
        while(*ssptr!='\0'){
            if(*ssptr!=*strptr){
                break;
            }
            ssptr++;
            strptr++;
        }
        
        if(*ssptr == '\0'){
            return i-1;
        }
        
        sentence++;
    }
    
    return -1;
}

int lastIndexSubstr(char *sentence, char *word){
    int firstIndex = firstIndexSubstr(sentence, word);
    int i = 0;
    while(*word!='\0'){
        word++;
        i++;
    }
    
    return firstIndex+i-1;
}

int countOccurances(char *sentence, char *word){
    int count = 0, wordLen = 0;
    int firstIndex = firstIndexSubstr(sentence,word);
    
   
    
    while(firstIndex != -1){
        count++;
        int lastindex = lastIndexSubstr(sentence,word);
        sentence += lastindex;
        firstIndex = firstIndexSubstr(sentence,word);
    }
    
    return count;
    
}

int main() {
    char str[100], word[50];


    std::cout << "Enter a sentence: ";
    std::cin.getline(str, 100);

    std::cout << "Enter a word to count occurrences: ";
    std::cin.getline(word, 50);

    countOccurances(str, word);
    std::cout << "The word \"" << word << "\" occurs " << countOccurances(str, word)
              << " times in the sentence." << std::endl;


    return 0;
}
