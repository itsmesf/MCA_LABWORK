#include <iostream>
using namespace std;

int fibonacci(int n){

    if (n == 0){
        return 0;
    }
    else if(n == 1){
        return 1;
    }
    else{
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

int main(){

    int x;
    cout << "Enter the number to which the series is to be printed:  " ;
    cin >> x;

    for( int i = 0; i <= x; i++){
        cout << fibonacci(i) << "  ";
    }

    return 0;
}
