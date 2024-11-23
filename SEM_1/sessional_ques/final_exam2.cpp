//Swap digits of number and print sum of a swapped digits using pointers
//from example..in case of 1234 --->sum  == 10 and incase of 12345 sum---->12

#include <iostream>

void swappedNum(char *num){
    int sum = 0;
    char *begin = num;
    char *end = num;
    
    while(*end!='\0'){
        end++;
    }
    
    end--;
    
    while(begin<end){
        char temp = *begin;
        *begin = *end;
        *end = temp;
        
        char beginc = *begin - '0';
        char endc = *end - '0';
        sum+=int(beginc)+int(endc);

        
        begin++;
        end--;
    }
    
    std::cout << "Sum of swapped digits: " << sum << std::endl;
}


int main() {
    
    char num[50];
    std::cout << "Enter a number: ";
    std::cin.getline(num,50);
    swappedNum(num);
    std::cout << "Swapped Number: " << num << std::endl;
}

