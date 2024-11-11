#include <iostream>

double add(double a, double b) {
    return a + b;
}

double subtract(double a, double b) {
    return a - b;
}

double multiply(double a, double b) {
    return a * b;
}

double divide(double a, double b) {
    if (b != 0) {
        return a / b;
    } else {
        std::cout << "Error: Division by zero is not allowed." << std::endl;
        return 0;
    }
}

void performOperation(int choice, double num1, double num2) {
    std::cout << "Enter first number: ";
    std::cin >> num1;

    std::cout << "Enter second number: ";
    std::cin >> num2;

    std::cout << "\nChoose the operation:\n";
    std::cout << "1. Addition\n";
    std::cout << "2. Subtraction\n";
    std::cout << "3. Multiplication\n";
    std::cout << "4. Division\n";
    std::cout << "Enter your choice (1-4): ";
    std::cin >> choice;
    double result;
    switch (choice) {
        case 1:
            result = add(num1, num2);
            std::cout << "Result (Addition): " << result << std::endl;
            break;
        case 2:
            result = subtract(num1, num2);
            std::cout << "Result (Subtraction): " << result << std::endl;
            break;
        case 3:
            result = multiply(num1, num2);
            std::cout << "Result (Multiplication): " << result << std::endl;
            break;
        case 4:
            result = divide(num1, num2);
            if (num2 != 0) {
                std::cout << "Result (Division): " << result << std::endl;
            }
            break;
        default:
            std::cout << "Invalid choice! Please choose a valid operation." << std::endl;
    }
}

int main() {
    double num1, num2;
    int choice;

    performOperation(choice, num1, num2);

    return 0;
}
