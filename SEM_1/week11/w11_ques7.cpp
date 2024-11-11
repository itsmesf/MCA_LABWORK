//Bubble Sort
#include<iostream>

void BubbleSort(int n, int array[]){
    for(int i = 0; i < n-1; i++){
        for(int j = 0; j < n-1; j++){
            if(array[j] > array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
}

void insertArrayElements(int n, int array[]){
    std::cout << "Insert Array Elements: ";
    for(int i = 0; i <n; i++){
        std::cin >> array[i];
    }
}

void SortedArrayElements(int n , int array[]){
    BubbleSort(n, array);
    std::cout << "Sorted Array Elements in ascending Order: ";
    for(int i =0 ; i < n;i++){
        std::cout << array[i] << "   ";
    }
    std::cout << std::endl;
}

int main(){

    int n, array[n];

    std::cout << "Enter number of elements to be inserted in array: ";
    std::cin >> n;

    insertArrayElements(n, array);
    SortedArrayElements(n, array);

    return 0;
}