//Write a program to check whether a given number is armstrong number

#include <iostream>
#include <cmath>

using namespace std;

int main(){

    char choice;

    do{
        int x,n,count = 0;
        double sum =0;
        cout << "\nEnter a number to check whether it is a armstrong number or not: ";
        cin >> x;
        n = x;

        while(n!=0){
            count++;
            n=n/10;
        }

        n = x;

        while(n != 0){
            int r = n % 10;
            sum  = sum + pow(r, count);
            n = n/10;
        }

        if (x == sum){
            cout << "It is a Armstrong number.";
        }
        else{
            cout << "It is not a Armstrong number.";
        }

        cout << "\n\nDo you want to continue? (y/n): ";
        cin >> choice;

    }

    while(choice == 'y' || choice == 'Y');

    return 0;
}
