#include <iostream>
using namespace std;

void positive_negative_integers(int n, int array[]){

    int positive_count = 0;
    int negative_count = 0;

    cout << "\n\nPositive integers in an Array: ";
    for (int i = 0 ; i < n; i++){
        if (array[i]> 0){
            cout << array[i] << "  ";
            positive_count++;
        }
    }

    cout << "\nCount of Positive integers in an Array: " << positive_count;

    cout << "\n\nNegative integers in an Array: ";
    for (int i = 0 ; i< n; i++){
        if (array[i]< 0){
            cout << array[i] << "  ";
            negative_count++;
        }
    }

    cout << "\nCount of Negative integers in an Array: " << negative_count;

}

void odd_even_integers(int n, int array[]){

    int odd_count = 0;
    int even_count = 0;

    cout << "\n\nOdd integers in an Array: ";
    for (int i = 0 ; i< n; i++){
        if (array[i]%2 != 0){
            cout << array[i] << "  ";
            odd_count++;
        }
    }

    cout << "\nCount of Odd integers in an Array: " << odd_count;

    cout << "\n\nEven integers in an Array: ";
    for (int i = 0 ; i< n; i++){
        if (array[i] % 2 == 0){
            cout << array[i] << "  ";
            even_count ++;
        }
    }

    cout << "\nCount of Even integers in an Array: " << even_count;
}

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

    positive_negative_integers(n, array);
    odd_even_integers(n, array);

    return 0;

}