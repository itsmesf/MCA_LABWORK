//insert elements in an array using pointers.

#include <iostream>
using namespace std;

int main(){

    int n;
    cout << "Enter elements to be inserted in an array: ";
    cin >> n;

    int array[n];
    int *ptr = array;

    cout << "\nInsert array elements: ";
    for(int i = 0 ; i < n ;i++){
        cin >> *(ptr+i);
    }

    cout << "\nArray elements: ";
    for (int i = 0; i< n ;i++){
        cout << array[i] << "  ";
    }

    return 0;
}