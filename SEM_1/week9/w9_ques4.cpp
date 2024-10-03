/*Write a C++ program to swap two number by both call by value and call by reference mechanism, using two
functions swap_value() and swap_reference respectively, by getting the choice from the user and executing the user’s
choice by switch-case.*/


#include<iostream>

void swap_value(int a, int b){

    std::cout << "\nNumbers before swapping: " << a << "   ,   "  << b << std::endl;

    int temp = a;
    a = b;
    b = temp;

    std::cout << "Numbers after swapping: " << a << "   ,   "  << b << std::endl;

}

void swap_reference(int& a, int& b){

    std::cout << "\nNumbers before swapping: " << a << "   ,   "  << b << std::endl;

    int temp = a;
    a = b;
    b = temp;

    std::cout << "Numbers after swapping: " << a << "   ,   "  << b << std::endl;
}

void insertValues(int& a, int& b ){
    std::cout << "\nInsert two Numbers: ";
    std::cin >> a >> b;

}


int main(){

    int a, b, sw;
    std::cout << "Select '1' for CALL BY VALUE METHOD and '2' for CALL BY REFERENCE METHOD: ";
    std::cin >> sw;

    switch(sw){
        case 1:{
            std::cout << "\nCALL BY VALUE METHOD FOR SWAPPING TWO VARIABLES" << std::endl;
            insertValues(a,b);
            swap_value(a,b);
            std::cout << "\nValue in the main() after swapping: " << a << "  ,  " << b;
            break;
        }
        case 2:{
            std::cout << "\nCALL BY REFERENCE METHOD FOR SWAPPING TWO VARIABLES" << std::endl;
            insertValues(a,b);
            swap_reference(a, b);
            std::cout << "\nValue in the main() after swapping: " << a << "  ,  " << b;
            break;
        }

        default:
            std::cout << "Wrong Input...";
    }

    return 0;
}

/*In C++, call by value means that a copy of the actual argument is passed to the function. Any modifications made to the
parameters inside the function do not affect the original arguments outside the function.

Copy of Variables: When you use call by value, the function receives a copy of the variables. Therefore, any
changes you make to the parameters inside the function only affect the local copies, not the original variables
in the main() function.

Isolation of Changes: Because the function works with these copies, the original values in main()
remain unchanged after the function finishes executing. */

/*

In the case of call by value, when you pass a = 10 and b = 20:

The function swap_value gets copies of these values (e.g., local copies a = 10, b = 20 inside the function).
Swapping happens only to the local copies (a = 20, b = 10), but once the function finishes, those local variables
 are destroyed.
The original a and b in main() remain unaffected because they were not modified directly.

In call by reference, the function receives references to the original arguments, meaning the function works
 directly with the variables from main(). Any changes to the variables in the function will reflect in the original
 variables.

*/










































