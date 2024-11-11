#include <iostream>

class myClass{

private:
    int num1, num2;

public:
    myClass(){
        num1 = 4;
        num2 = 2;
    }

    void displayValues() {
        std::cout << "Value of num1: " << num1 << std::endl;
        std::cout << "Value of num2: " << num2 << std::endl;
    }
};

int main(){

    myClass obj1;
    obj1.displayValues();
    return 0;
}