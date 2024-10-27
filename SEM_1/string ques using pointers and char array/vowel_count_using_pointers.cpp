//vowel count in a string using pointers(char arrays)

#include<iostream>
#include <cctype>

int countVowel(char *ch){
    int count = 0;
    while(*ch!='\0'){
        *ch = tolower(*ch);

        if(*ch == 'a' || *ch == 'e'|| *ch == 'i' || *ch == 'o' || *ch == 'u'){
            count++;
        }
        ch++;
    }

    return count;
}

int main(){
    char str[50];
    std::cout << "Enter a string: ";
    std::cin.getline(str, 50);

    std::cout << "Vowel count: " << countVowel(str);
}
