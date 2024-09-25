#include <iostream>
using namespace std;

int main(){

    int array[]= {2,3, 4, 6,7};

    int length = sizeof(array) / sizeof (array[0]);

    cout << "Length of array: " << length;

    return  0;
}