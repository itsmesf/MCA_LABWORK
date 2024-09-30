//Compute the sum, mean, standard deviation of all elements stored in an array using pointers;

#include <iostream>
#include <cmath>

float sum_elements(int n, float *array){
    float sum = 0;
    for(int i = 0; i< n; i++){
        sum+=*(array+i);
    }
    return sum;
}

float mean_elements(int n, float *array){
    float mean = sum_elements(n, array)/ n;
    return mean;
}

float standard_deviation(int n, float *array){

    float sd = 0, diff_mean = 0, mean = mean_elements(n, array);

    for(int i = 0; i < n ;i++){
        diff_mean+= powf((*(array+i) - mean),2);
    }

    sd = sqrtf(diff_mean/n);

    return sd;
}



int main(){
    int n;
    auto *array = new float[n];

    std::cout << "Enter elements to be inserted in an array: ";
    std::cin >> n;

    std::cout << "Insert array elements: ";
    for(int i = 0; i < n ;i++){
        std::cin >> *(array+i);
    }

    std::cout << "\nArray elements: ";
    for(int i = 0; i < n ;i++){
        std::cout<< *(array+i) << " ";
    }

    std::cout << "\nSum: " << sum_elements(n,array);
    std::cout << "\nMean: " << mean_elements(n, array);
    std::cout << "\nStandard Deviation: " << standard_deviation(n, array);

    return 0;

}