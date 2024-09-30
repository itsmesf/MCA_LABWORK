//Find the greatest of two numbers using this pointers which returns the member variable
#include <iostream>

class number{
private:
    int a, b;

public:
    void setInput(){
        std::cout << "Enter two numbers: ";
        std::cin >> a >> b;
    }

    int greatestNumber(){
        if(this->a > this->b)
            return this->a;
        else
            return this->b;
    }

};

int main(){

    number obj;

    obj.setInput();
    std::cout << "\nGreatest of two numbers: " << obj.greatestNumber();

    return 0;
}
