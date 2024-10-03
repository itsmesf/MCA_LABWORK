//Write a C++ program to find sum of elements of array using recursion

#include <iostream>

int sumArrayElements(int n , int arr[]){
    if(n<=0)
        return 0;

    return arr[n-1] + sumArrayElements(n-1, arr);
}

void insertElements(int n, int arr[], int index = 0){

    if (index == n){
        return;
    }
    std::cin >> arr[index] ;

    insertElements(n, arr, index+1);
}

int main() {

    int n, arr[n];

    std::cout << "Insert number of elements to be inserted in an array: ";
    std::cin >> n;

    std::cout << "Insert array elements: ";
    insertElements(n, arr);

    std::cout << "\nSum array elements:" << sumArrayElements(n, arr);
    std::cout << std::endl;

    return 0;
}