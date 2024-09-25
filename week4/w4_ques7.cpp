//Write a program to find the roots of quadratic equations.

#include <iostream>
#include <cmath>
#include <ccomplex>

using namespace std;

void findRoots(double a, double b, double c){

    double discriminant = (b * b) - (4 * a * c);

            if (discriminant > 0 ){

                double root1 = (-b + sqrt(discriminant)) / (2 * a);
                double root2 = (-b - sqrt(discriminant)) / (2 * a);

                cout << "\nRoots are real and distinct.";
                cout <<"\nRoots = " << root1 << " , " << root2;
            }

            else if (discriminant == 0){
                double root = (-b) / (2 * a);
                cout << "\nRoots are real and repeated.";
                cout <<"\nRoots = " << root << " , " << root;
            }

            else{
               complex <double>  root1 = complex<double>(-b , sqrt(-discriminant))/(2.0 * a);
               complex <double> root2 = complex<double>(-b , -sqrt(-discriminant))/(2.0 * a);
                cout << "\nRoots are imaginary.";
                cout <<"\nRoots = " << root1 << " , " << root2;
            }
}

int main(){

    double x, y, z;
    char ss_Two = 253;
    char choice;

    do{
        cout << "Enter the coefficient of x"<< ss_Two << " : ";
        cin >> x;

        if (x == 0){
            cout << "Coefficient of x" << ss_Two << " can't be 0.";
        }
        else{
            cout << "Enter the coefficient of x : " ;
            cin >> y;
            cout << "Enter the constant term : ";
            cin >> z;
            cout << "\nQuadratic Equation: " << x << "x"<<ss_Two << " + " << y << "x + " << z << " = 0";
            cout << "\n";

            findRoots(x, y, z);
        }

        cout << "\n\nDo you want to continue? (y/n): ";
        cin >> choice;
    }
    while(choice == 'Y' || choice == 'y');

    return 0;
}