//Write C++ program to generate all prime numbers between 1 and n, where n is the value supplied by the user.

#include <iostream>
using namespace std;

int main(){
    int n;
    cout << "Enter the number to display prime number: ";
    cin >> n;

    int noPrime = 0;
    for(int i = 2; i <= n ; i++){
        bool isPrime =  true;
        for( int j = 2 ; j <= i/2; j++ ){
            if (i % j == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            cout << i << " ";
            noPrime = 1;
        }
    }

    if(!noPrime){
       cout << "No prime number exists.";
    }

    return 0;
}