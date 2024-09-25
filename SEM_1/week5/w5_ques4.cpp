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

        cout << array[i] << "  ";
    }

    //Sorting elements using bubble sort

    for (int i =0; i<n-1;i++){
        for(int j = 0 ; j<n-1; j++){
            if (array [j] < array [j+1]){
                int temp =  array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }

    cout << "\nElements after Sorting: ";
    for(int i  = 0; i<n; i++){
        cout << array[i] << "   ";
    }

    int max = array[0];
    bool isMax = true;

    for(int i = 1; i < n;i++){
        if (max !=array[i]){
            cout << "\nSecond largest element: " << array[i];
            isMax = false;
            break;
        }
    }

    if(isMax){
        cout << "\nSecond largest element does not exists in this array.";
    }

}
