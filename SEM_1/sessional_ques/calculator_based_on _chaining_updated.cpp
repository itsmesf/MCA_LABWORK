#include <iostream>

class calculator {
    
private:
	int a, b;

public:

	calculator(int num1, int num2) {
		a  = num1;
		b = num2;
	}

	calculator& add() {
		std::cout << "Addition: " << this->a+this->b << std::endl;
		return *this;
	}

	calculator& sub() {
		std::cout << "Subtraction: " << this->a-this->b << std::endl;
		return *this;
	}

	calculator& mul() {
		std::cout << "Multiplication: " << this->a*this->b << std::endl;
		return *this;
	}
    
     calculator& divi(){
         if(this->b !=0){
             std::cout << "Division: " << this->a/this->b << std::endl;
         }
         else{
             std::cout << "Not defined..." << std::endl;
         }
        return *this;
    }
    
    calculator& print(){
        return *this;
    }

};

int main()
{
	
    int a, b;
	
	std::cout<<"Enter two numbers: ";
	std::cin >> a >> b;
	
	calculator obj(a, b);
	
	obj.add().sub().mul().divi().print();

	return 0;
}
