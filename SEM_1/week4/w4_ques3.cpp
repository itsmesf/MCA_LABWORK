#include <iostream>
using namespace std;

int main(){
    float a, b,c,d,e,f,g;

    cout << "Enter the value of a: \n";
    cin >> a;
    cout << "Enter the value of b: \n";
    cin >> b;
    cout << "Enter the value of c: \n";
    cin >> c;
    cout << "Enter the value of d: \n";
    cin >> d;
    cout << "Enter the value of e: \n";
    cin >> e;
    cout << "Enter the value of f: \n";
    cin >> f;
    cout << "Enter the value of g: \n";
    cin >> g;

    float value =  ((a + b/ c * d - e) * (f - g));

    cout << "\nResultant value: " << value;

    return 0;
}