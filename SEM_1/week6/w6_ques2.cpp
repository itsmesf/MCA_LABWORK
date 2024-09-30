//Swap two numbers using pointers

#include <iostream>

void swap(int* a, int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main(){

    int a, b;
    std::cout << "Enter two variables: ";
    std::cin >> a>>b;

    std::cout << "\nNumber before Swapping: " << a << "   " << b;
    swap(&a, &b);
    std::cout << "\nNumber after Swapping: " << a << "   " << b;
    return 0;
}