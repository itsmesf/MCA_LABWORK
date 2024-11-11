#include <iostream>
#include<cmath>

class triangle{

private:
    double base, height;

public:
    triangle(double b, double h) : base(b) , height(h){}

    double hypo(){
         return sqrt(pow(base,2)+pow(height,2));
    }

    double area(){
        return (0.5 * base * height);
    }

};

int main(){
    double base, height;

    std::cout << "Enter base of a right-angled triangle: ";
    std::cin >> base;
    std::cout << "Enter height of a right-angled triangle: ";
    std::cin >> height;

    triangle right_angled(base, height);
    std::cout << "Hypotenuse of a right angled triangle with base " << base << " and height " << height << " is: " <<right_angled.hypo() << std::endl;
    std::cout << "Area of a triangle: " << right_angled.area() << std::endl;

    return 0;

}