//Sum of array elements using pointers

#include <iostream>

int main(){
   int n, *array = new int[n], sum = 0;
   std::cout << "Enter number of elements to be inserted in an array: ";
   std::cin >> n;

   std::cout << "\nInsert array elements: ";
   for ( int i = 0; i < n ;i++){
       std::cin >> *(array+i);
       sum += *(array+i);
   }

   std::cout << "\nSum of elements : " << sum;

   return 0;
}
