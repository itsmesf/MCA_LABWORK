#include<iostream>

class calculator{
    private:
    float a, b;
    
    public:
    
    calculator* setData(float a, float b){
        this->a = a;
        this->b = b;
        return this;
    }
    
    calculator* add(){
        std::cout << "SUM: " << this->a+this->b << std::endl;
        return this;
    }
    
    calculator* sub(){
        std::cout << "SUBTRACTION: " << this->a-this->b <<std::endl;
        return this;
    }
    
    calculator* mul(){
        std::cout << "MULTIPLICATION: " << this->a * this->b << std::endl;
        return this;
    }
    
    calculator* divide(){
        if(this->b != 0)
        std::cout << "DIVISION: " << this->a/ this->b << std::endl;
        else
        std::cout << this->b <<" cannot be zero";
        return this;
    }
    
    calculator* displayData(){
        return this;
    }
};

int main(){
    calculator obj;
    int a, b;
    std::cout << "Enter two numbers: ";
    std::cin >> a >> b;
    
    obj.setData(a,b)->add()->sub()->mul()->divide()->displayData();
    
    return 0;
}
