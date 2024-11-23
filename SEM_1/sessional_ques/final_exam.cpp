*******************************************************************************/
//Count number of consonants, small case letters and length of a word
#include <iostream>

int wordLen(std::string word){
    return word.length();
}

void letterCount(std::string word){
    int smallCase = 0, vowelCount = 0;
    for(int i = 0; i<word.length();i++){
        if(word[i]>='a'&&word[i]<='z'){
            smallCase++;
        }
        
        word[i] = tolower(word[i]);
        
        if(word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i]=='o' || word[i] == 'u'){
            vowelCount++;
        }
    }
    
    std::cout << "Small Case letters: " << smallCase << std::endl;
    std::cout << "Consonant Count: "  << word.length()-vowelCount << std::endl;
    
}

int main(){
    std::string word;
    std::cout << "Enter a word: ";
    std::cin >> word;
    
    std::cout << "Word Length: " << wordLen(word) << std::endl;
    letterCount(word);
    
    return 0;
}

