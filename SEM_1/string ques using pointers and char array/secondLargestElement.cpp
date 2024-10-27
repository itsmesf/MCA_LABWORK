#include<iostream>

void bubbleSort(int n, int array[]){
    
    for(int i = 0; i< n-1; i++){
        for(int j  = 0; j <n-1; j++){
            if(array[j] < array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    
}

void secondLargestInt(int n, int array[]){
  bubbleSort(n, array);
    
    int max=array[0];
    bool flag = 0; 
    for(int i = 1; i< n; i++){
        if(max!=array[i]){
            std::cout << "Second largest element: " << array[i] << std::endl;
            flag = 1;
            return;
        }
    }
    
    if(!flag){
        std::cout << "All the elements are same:" << max << std::endl;
    }
    
}

int main(){
    
    int n;
    
    std::cout << "Enter number of elements to be elements to be inserted in an array: ";
    std::cin >> n;
    
    int array[n];
    
    std::cout << "Insert array elements: ";
    for(int i = 0; i < n ; i++){
        std::cin >> array[i];
        
    }
    
   secondLargestInt(n, array);
    return 0;
}
