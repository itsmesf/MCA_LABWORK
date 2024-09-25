#include <iostream>
using namespace std;

int main(){

    int n;

    cout << "Enter number to elements to be inserted in an Array: ";
    cin >> n;

    int array[n];

    //Scanning and Inserting array elements

    cout << "Enter elements to be inserted in an array: ";
    for(int i = 0; i<n; i++){
       cin >>  array[i];
    }

    cout << "\nDisplaying Inserted Array elements: {";
    for(int i = 0; i<n-1;i++){

        cout << array[i] << " , ";
    }

    cout << array[n-1] << "}";

    return 0;
}