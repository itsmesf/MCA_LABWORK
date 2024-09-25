#include <iostream>
using namespace std;

int main(){
    int x;
    cout << "Enter a number: ";
    cin >> x;

    string result =  (x%2==0) ? "Even number" : "Odd Number";
    cout << result;

    return 0;
}