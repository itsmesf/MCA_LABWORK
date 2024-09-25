//Program to merge to two sorted arrays into another array in sorted order.

#include <iostream>
using namespace std;

void sort(int n, int array[]){

    for (int i = 0;i < n-1; i++){
        for (int j= 0; j < n-1 ;j++){
            if (array[j] > array [j+1]){
                int temp = array[j];
                array [j] = array [j+1];
                array[j+1] = temp;
            }
        }
    }
}


int main(){

    int n, m;

   //First array

    cout << "Enter number to elements to be inserted in first Array: ";
    cin >> n;

    int array_n[n];

    //Scanning and Inserting array elements

    cout << "Enter elements to be inserted in an array: ";
    for(int i = 0; i<n; i++){
        cin >>  array_n[i];
    }


    //Second Array

    cout << "\nEnter number to elements to be inserted in second Array: ";
    cin >> m;

    int array_m[m];

    //Scanning and Inserting array elements

    cout << "Enter elements to be inserted in an array: ";
    for(int i = 0; i<m; i++){
        cin >>  array_m[i];
    }

    //Displaying both arrays.

    sort(n,array_n);
    sort(m, array_m);

    cout << "\nDisplaying Inserted First Array elements: ";
    for(int i = 0; i<n;i++){
        cout << array_n[i] << "   ";
    }

    cout << "\nDisplaying Inserted Second Array elements: ";
    for(int i = 0; i<m;i++){
        cout << array_m[i] << "   ";
    }

    //merged array
    int array_mn[m+n];

   int i = 0, j = 0, k = 0;

    while (i < n && j < m) {
        if (array_n[i] < array_m[j]) {
            array_mn[k++] = array_n[i++];
        } else {
            array_mn[k++] = array_m[j++];
        }
    }

    // Adding remaining elements of array_n
    while (i < n) {
        array_mn[k++] = array_n[i++];
    }

    // Adding remaining elements of array_m
    while (j < m) {
        array_mn[k++] = array_m[j++];
    }

    cout << "\nMerged Sorted Array: ";
    for (int z = 0; z < (m + n); z++) {
        cout << array_mn[z] << "  ";
    }

    return 0;

}

