//Prime fibonacci number

#include <iostream>
int fibonacci(int n){
    if(n<=1){
        return n;
    }

    else
        return fibonacci(n-1)+ fibonacci(n-2);
}

bool isPrime(int n){

    for(int i = 2; i <=n/2 ; i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

int main(){
    int n;

    std::cout << "Enter a number to which the series is to be printed: ";
    std::cin >> n;

    std::cout << "Prime fibonacci series: ";
    for(int i = 3 ; i <= n ;i++){
        if(isPrime(fibonacci(i))){
            std::cout << fibonacci(i) << "  ";
        }
    }
    return 0;
}