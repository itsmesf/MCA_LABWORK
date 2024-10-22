/substring starting with two characters
#include <iostream>

void tolowerStr(std::string &str){
    for(int i = 0; i< str.length(); i++){
        if(str[i]>='A' && str[i] <= 'Z'){
            str[i] = tolower(str[i]);
        }
    }
}

void findSubStr(std::string str, char s, char e){
    bool found = false;
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
                 std::cout << "Substring: " << result << std::endl;
                 found =true;
                 break;
            }
           
        }
    }
    
    if(!found){
         std::cout << "Substring not found!!";
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
