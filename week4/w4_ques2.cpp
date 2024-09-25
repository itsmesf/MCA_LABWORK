#include <iostream>
using namespace std;

int add(int a, int b){
     while (b!=0){
         int carry = (a & b) << 1;
         a = a ^ b;
         b = carry;
     }
    return a;
}

int main(){
    int num1, num2;
    cout << "Enter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;

    cout << "Sum: " << add(num1, num2) << endl;
    return 0;
}
