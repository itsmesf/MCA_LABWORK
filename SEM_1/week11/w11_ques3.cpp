#include <iostream>

int reverseNumber(int num) {
    int reversed = 0;
    while (num > 0) {
        reversed = reversed * 10 + num % 10;
        num /= 10;
    }
    return reversed;
}

int sumWithReverse(int num) {
     return reverseNumber(num)+num;
}

void sumOfAlternativeDigits(int num) {
    int oddSum = 0;
    int evenSum = 0;
    int i = 1;
    while(num!=0){
        int r = num%10;
        if(i%2!=0){
            oddSum+=r;
        }
        else{
            evenSum+=r;
        }
        i++;
        num = num/10;
    }

    std::cout << "Sum of even alternative digits: " << evenSum << std::endl;
    std::cout << "Sum of odd alternative digits: " << oddSum << std::endl;
}

void performOperation(int choice, int num) {
    std::cout << "Enter a 4-digit integer: ";
    std::cin >> num;

    if (num < 1000 || num > 9999) {
        std::cout << "Error: Please enter a valid 4-digit number." << std::endl;
        return;
    }

    std::cout << "\nChoose an operation:\n";
    std::cout << "1. Reverse the number\n";
    std::cout << "2. Sum of the number with its reverse\n";
    std::cout << "3. Sum of alternative digits (1st+3rd and 2nd+4th)\n";
    std::cout << "Enter your choice (1-3): ";
    std::cin >> choice;
    switch (choice) {
        case 1:
            std::cout << "Reverse of the number: " << reverseNumber(num) << std::endl;
            break;
        case 2:
            std::cout << "Sum of the number with its reverse: " << sumWithReverse(num) << std::endl;
            break;
        case 3:
            sumOfAlternativeDigits(num);
            break;
        default:
            std::cout << "Invalid choice! Please select a valid option." << std::endl;
    }
}

int main() {
    int num, choice;

    performOperation(choice, num);

    return 0;
}
