//Reverse array elements;

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

    cout << "\nDisplaying Inserted Array elements: ";
    for(int i = 0; i<n;i++){
        cout << array[i] << "   ";
    }


    for(int i = 0; i < n/2;i++){

        int temp = array[i];
        array[i] = array[n-i-1];
        array [n-i-1] = temp;
    }

    cout << "\nArray elements after reversing: ";

    for(int i =0; i<n;i++){
        cout << array[i]<< "  ";
    }

    return 0;
}