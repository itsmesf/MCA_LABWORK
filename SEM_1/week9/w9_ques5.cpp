//Write a C++ program to display all array elements using recursion.

#include <iostream>
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
    std::cout << std::endl;

    return 0;
}