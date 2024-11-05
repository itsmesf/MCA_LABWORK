//first lab sessional ques

#include <iostream>
#include <string>

int main(){
    std::string rev = "";
    int n;

    std::cout << "Enter a number: ";
    std::cin>>n;

    while(n!=0){
        int r = n%10;
        rev+=std::to_string(r);
        n=n/10;
    }

    std::cout << "\nReversed number: " << rev;
    return 0;
}