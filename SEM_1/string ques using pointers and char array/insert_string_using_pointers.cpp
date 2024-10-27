//display string using pointers(char arrays)

#include <iostream>

int main(){
    char c[50], *ptr = c;
    std::cout << "Enter a string: ";
    std::cin.getline(c,50);

    std::cout << "Your entered string: ";
    while(*ptr != '\0'){
        std::cout << *ptr;
        ptr++;
    }

    return 0;
}
