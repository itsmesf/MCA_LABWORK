//Display address of a variable

#include <iostream>

int main(){

    int x, *ptr = &x;
    std::cout << "Address of a declared variable is: " << ptr;
    return 0;
}