//substring starting with two characters
#include <iostream>
#include <vector>
void tolowerStr(std::string &str){
    for(int i = 0; i< str.length(); i++){
        if(str[i]>='A' && str[i] <= 'Z'){
            str[i] = tolower(str[i]);
        }
    }
}

void findSubStr(std::string str, char s, char e){
    bool found = false;
    std::vector<std::string> substr;
    for(int i = 0; i< str.length();i++){
        if(str[i] == s){
            std::string result;
            int j  = 0;
            while(str[i+j]!=e && (i+j)<str.length()){
                if(str[i+j] != ' '){
                    result+=str[i+j];
                }
               j++; 
            }
            if(str[i+j] == e && (i+j)<str.length()){
                 result+=e;
                 substr.push_back(result);
            }
           
        }
    }
    
    //largest substring
    
    for(int i = 0; i<substr.size()-1; i++){
        for(int j = 0 ; j < substr.size()-1; j++){
             if(substr[j] > substr[j+1]){
                 std::string temp = substr[j];
                 substr[j] = substr[j+1];
                 substr[j+1] = temp;
             }
        }
    }
    
    if(substr.size()!=0){
        std::cout << "Longest Substring: " << substr[0];
    }
    
    else{
        std::cout << "Substring not found";
    }
}

int main()
{
    
    std::string str; char s; char e;
    std::cout<<"Enter a string: ";
    getline(std::cin, str);
    
    std::cout<<" Enter two characters: ";
    std::cin >> s >> e;
    
    tolowerStr(str);s=tolower(s);e=tolower(e);
    findSubStr(str, s, e);
    return 0;
}
