//Write C++ programs that use both recursive and non-recursive functions to solve towers of Hanoi problem.
#include <iostream>
#include <cmath>

unsigned int towerOfHanoi_Recursive(unsigned int n) {

    // Base case: Only one disk
    if (n == 1)
        return 1;

    // Recursive case: Move n-1 disks twice and add one move for the nth disk
    return (2 * towerOfHanoi_Recursive(n - 1)) + 1;
}

unsigned int towerOfHanoi_nonRecursive(unsigned int n){

    if(n>=1)
       return std::pow(2,n) - 1;
}

int main(){

    unsigned int n; // n==disks

    std::cout << "Enter the number of disks: ";
    std::cin >>n;

    if(n<=0){
        std::cout << "Atleast one disk is required...";
    }

    else{
        std::cout << "\nNumber of moves using recursive method: " << towerOfHanoi_Recursive(n) << std::endl;
        std::cout << "\nNumber of moves using non-recursive method: " << towerOfHanoi_nonRecursive(n) << std::endl;
    }


    return 0;
}