#include <iostream>

void operation(int num1, int num2) {
    double result;
    int choice;

    std::cout << "Enter two numbers: ";
    std::cin >> num1 >> num2;

    std::cout << "\nChoose the operation:\n";
    std::cout << "1. Addition\n";
    std::cout << "2. Subtraction\n";
    std::cout << "3. Multiplication\n";
    std::cout << "4. Division\n";
    std::cout << "Enter your choice (1-4): ";
    std::cin >> choice;

    switch (choice) {
        case 1:
            result = num1 + num2;
            std::cout << "Result (Addition): " << result << std::endl;
            break;
        case 2:
            result = num1 - num2;
            std::cout << "Result (Subtraction): " << result << std::endl;
            break;
        case 3:
            result = num1 * num2;
            std::cout << "Result (Multiplication): " << result << std::endl;
            break;
        case 4:
            if (num2 != 0) {
                result = num1 / num2;
                std::cout << "Result (Division): " << result << std::endl;
            } else {
                std::cout << "Error: Division by zero is not allowed." << std::endl;
            }
            break;
        default:
            std::cout << "Invalid choice! Please choose a valid operation." << std::endl;
    }
}

int main() {
    int num1, num2;
    operation(num1,num2);
    return 0;
}
