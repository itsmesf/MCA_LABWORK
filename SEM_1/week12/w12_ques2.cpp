#include<iostream>

class calculator{
private:
    double a, b, c, d;

public:
    calculator():a(0) , b(0), c(0),d(0){
        std::cout << "Default Constructor values: " << "a = " << a << " , b = " << b << " , c = " << c << " , d = " << d << std::endl;
        std::cout << std::endl;
    }

    calculator(double a, double b){
        std::cout << "Arithmetic Operations using two parameters" << std::endl;
        std::cout << "\nAddition: " << a + b << std::endl;
        std::cout << "Subtraction: " << a - b << std::endl;
        std::cout << "Multiplication: " << a*b << std::endl;
        if(b!=0)
           std::cout << "Division: " << a/b <<  std::endl;
        else
            std::cout << "Cannot be defined" << std::endl;
        std::cout << std::endl;
    }

    calculator(double a, double b, double c){
        std::cout << "Arithmetic Operations using three parameters" << std::endl;
        std::cout << "\nAddition: " << a + b + c << std::endl;
        std::cout << "Multiplication: " << a * b * c<< std::endl;
        std::cout << std::endl;
    }

    calculator(double a, double b, double c, double d){
        std::cout << "Arithmetic Operations using three parameters" << std::endl;
        std::cout << "\nAddition: " << a + b + c + d << std::endl;
        std::cout << "Multiplication: " << a * b * c * d << std::endl;
    }
};

int main(){

    int a, b, c, d;

    std::cout << "Enter four numbers: ";
    std::cin >> a >> b >> c >> d;

    calculator calc1;
    calculator calc2(a,b);
    calculator calc3(a,b,c);
    calculator calc4(a,b,c,d);

    return 0;
}