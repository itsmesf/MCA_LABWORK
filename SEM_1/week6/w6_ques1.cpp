//Week-6 is based on pointers
//Add two numbers using pointers

#include <iostream>

int add(int* a, int* b){
    return *a + *b;
}
int main(){

    int a, b;

    std::cout << "Enter two numbers: ";
    std::cin >>a >>b;

    std::cout << "Sum: " << add(&a, &b);
    return 0;
}