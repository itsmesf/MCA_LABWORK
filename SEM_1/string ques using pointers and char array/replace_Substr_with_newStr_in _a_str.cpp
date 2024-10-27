#include <iostream>

void strCopy(char *source, char *destination){
    while(*source!='\0'){
        *destination = *source;
        source++;
        destination++;
    }
    
    *destination = '\0';
}

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

int lastIndexSubStr(char *sentence, char *substr){
    
    int firstIndex = firstindexSubstr(sentence, substr);
    int i = 0;
    
    if(firstIndex == -1){
        return -1;
    }
    
    char *ssptr = substr;
    
    while(*ssptr!='\0'){
        ssptr++;
        i++;
    }
    
    return firstIndex+i-1;
}

void replaceSubstr(char *sentence, char *Oldsubstr, char *newSubstr, char *result){
    int firstIndex = firstindexSubstr(sentence, Oldsubstr);
    int lastIndex =  lastIndexSubStr(sentence, Oldsubstr);
    
    if(firstIndex == -1){
        strCopy(sentence,result);
        return;
    }
    
    for(int i =0 ; i<firstIndex; i++){
        *result = *sentence;
        sentence++;
        result++;
    }
  
    
    while(*newSubstr!='\0'){
        *result = *newSubstr;
        newSubstr++;
        result++;
    }
    
    sentence+=(lastIndex-firstIndex+1);
    
    while(*sentence!='\0'){
        *result = *sentence;
        sentence++;
        result++;
    }
    
    *result = '\0';
}

void replaceAllSubstr(char *sentence, char *Oldsubstr, char *newSubstr, char *result){
   char tempResult[50];
   strCopy(sentence, tempResult);
   result[0] = '\0';
   while(firstindexSubstr(tempResult,Oldsubstr)!=-1){
       replaceSubstr(tempResult,Oldsubstr,newSubstr,result);
       strCopy(result,tempResult);
   }
}




int main(){
    char str[50], oldSubstr[50], newSubstr[50], result[50];

    std::cout << "Enter a sentence: ";
    std::cin.getline(str, 50);

    std::cout << "Enter the substring to replace: ";
    std::cin.getline(oldSubstr, 50);

    std::cout << "Enter the new substring: ";
    std::cin.getline(newSubstr, 50);

    // Replace the old substring with the new one
    replaceAllSubstr(str, oldSubstr, newSubstr, result);

    // Output the result
    std::cout << "Resulting sentence: " << result << std::endl;

    return 0;
}
