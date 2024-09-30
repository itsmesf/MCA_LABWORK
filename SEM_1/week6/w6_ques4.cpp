//Increment and decrement of variable value using pointers

#include <iostream>
using namespace std;

int main(){

    int x, *ptr = &x;
    int sw;
    char choice;

    cout << "Enter a variable: ";
    cin >> x;
    do {
        cout << "\nSelect '1' for INCREMENT and '2' for DECREMENT: ";
        cin >> sw;

        switch (sw) {
            case 1: {

                cout << "\nNumber after Increment:  " << ++(*ptr);
                break;
            }
            case 2: {

                cout << "\nNumber after Decrement: "<<   --(*ptr);
                break;
            }

            default:
                cout << "Wrong Input";
        }

        cout << "\nDo you want to continue (y/n) : ";
        cin >> choice;
    }
    while(choice == 'y' || choice == 'Y');

    return 0;
}