//Write a C++ program to use this pointer and return the pointer reference.

#include <iostream>

class myClass{

private:
    int num;

public:
    //myClass(int n) : num(n) {} --- Constructor to initialize value;

    myClass* set_value(int n){
       this->num = n;
        return this;
    }

    void print_value(){
        std::cout << "Value: " << num << std::endl;
    }
};

int main(){
    myClass obj;
    int n;

    std::cout << "Enter a number: ";
    std::cin >> n;

    obj.set_value(n)->print_value(); //set value and return pointer reference;

    std::cout << "\nEnter another input: ";
    std::cin >> n;

    obj.set_value(n)->print_value();

    return 0;
}