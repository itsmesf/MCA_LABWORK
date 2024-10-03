/*Write C++ programs that use both recursive and non-recursive functions to find:
a) The factorial of a given integer.
b) To find the greatest common divisor of two given integers*/

#include <iostream>

unsigned long long int factorial_recur(int n){
    if(n==0)
        return 1;

    return n * factorial_recur(n-1);
}

unsigned long long int factorial_nonRecur(int n){
    unsigned long long int fact = 1;
    for(int i = 0; i < n; i++){
        fact+=fact*i;
    }
    return fact;
}

int gcdRecursive(int a, int b){
    if(a%b==0)
        return b;
    return gcdRecursive(b, a%b);
}

int gcdNonRecursive(int a, int b){
    while(b!=0){
        int r = a%b;
        a = b;
        b = r;
    }
    return a;
}

int main(){

    int sw;
    std::cout << "Select '1' for GCD and '2' for FACTORIAL: ";
    std::cin >> sw;

    switch (sw) {
        case 1:{
            unsigned int a, b;
            std::cout << "Enter first number: ";
            std::cin >> a;

            std::cout << "Enter second number: ";
            std::cin >> b;

            std::cout << "\nGCD of " << a << " and " << b << " using RECURSIVE method: " << gcdRecursive(a, b) << std::endl;
            std::cout << "\nGCD of " << a << " and " << b << " using NON-RECURSIVE method: " << gcdNonRecursive(a,b) << std::endl;

            break;
        }

        case 2:{
            unsigned int a;
            std::cout << "Enter a number: ";
            std::cin >> a;

            std::cout << "\nFactorial of " << a << " using RECURSIVE method: " << factorial_recur(a)<< std::endl;
            std::cout << "\nFactorial of " << a << " using NON-RECURSIVE method: " << factorial_nonRecur(a) << std::endl;

            break;
        }

        default:
            std::cout << "Wrong Input...";
    }

    return 0;
}