//Program to find the frequency of particular number in a list of numbers.

#include <iostream>
using namespace std;

int main(){

    int n, element;
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

        cout << array[i] << "  ";
    }

    cout << "\nEnter the element to found its frequency:  ";
    cin >> element;

    int frequency = 0;

    for (int i = 0;i<n;i++){
        if(element == array[i]){
            frequency++;
        }
    }

    if (frequency==0){
        cout << "\nElement doesn't exists.";
    }
    else{
       cout << "\nFrequency of " << element <<" is: "<<frequency;
    }

    return 0;
}

