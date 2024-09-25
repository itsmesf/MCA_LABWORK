#include <iostream>
using namespace std;

int main(){

    int n;
    cout << "Enter number of elements to be inserted in an array: ";
    cin >> n;
    int array[n];

    int sum = 0;
    cout << "Insert array elements: ";
    for(int i = 0; i<n ; i++){
        cin >> array[i];
        sum += array[i];
    }
    cout << "\nSum of array elements: " << sum;

    return 0;
}