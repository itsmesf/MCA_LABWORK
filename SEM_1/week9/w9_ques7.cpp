//Write a C++ program to find maximum and minimum elements in array using recursion.

#include <iostream>

int findMax(int arr[], int n){
    if(n==1)
        return arr[0];
    return std::max(arr[n-1], findMax(arr,n-1));
}

int findMin(int arr[] , int n){
    if(n == 1)
        return arr[0];
    return std::min(arr[n-1], findMin(arr, n-1));
}

void displayElements(int n, int arr[], int index = 0){

    if (index == n){
        return;
    }
    std::cout << arr[index] <<  "   ";

    displayElements(n, arr, index+1);
}

void insertElements(int n, int arr[], int index = 0){

    if (index == n){
        return;
    }
    std::cin >> arr[index] ;

    insertElements(n, arr, index+1);
}

int main(){

    int n, arr[n];

    std::cout << "Insert number of elements to be inserted in an array: ";
    std::cin >> n;

    std::cout << "Insert array elements: ";
    insertElements(n, arr);

    std::cout << "\nDisplaying array elements:";
    displayElements(n,arr);

    std::cout <<  std::endl;

    std::cout << "\nMaximum Value of Element: " << findMax(arr, n) <<  std::endl;
    std::cout << "\nMinimum Value of Element: " << findMin(arr, n) << std::endl;

    return 0;
}