#include <iostream>
#include <string>

void DecimalToBinary(int num) {
    if (num == 0) {
        std::cout << "Number after conversion to Binary: 0" << std::endl;
        return;
    }

    std::string binary;

    while (num != 0) {
        int r = num % 2;
        binary = std::to_string(r) + binary;
        num = num / 2;
    }

    std::cout << "Number after conversion to Binary: " << binary << std::endl;
}

void DecimalToOctal(int num) {
    if (num == 0) {
        std::cout << "Number after conversion to Octal: 0" << std::endl;
        return;
    }

    std::string octal;

    while (num != 0) {
        int r = num % 8;
        octal = std::to_string(r) + octal;
        num = num / 8;
    }

    std::cout << "Number after conversion to Octal: " << octal << std::endl;
}

void DecimalToHexadecimal(int num) {
    if (num == 0) {
        std::cout << "Number after conversion to Hexadecimal: 0" << std::endl;
        return;
    }

    std::string hexa;

    while (num != 0) {
        int r = num % 16;

        if (r == 10) {
            hexa += 'A';
        } else if (r == 11) {
            hexa += 'B';
        } else if (r == 12) {
            hexa += 'C';
        } else if (r == 13) {
            hexa += 'D';
        } else if (r == 14) {
            hexa += 'E';
        } else if (r == 15) {
            hexa += 'F';
        } else {
            hexa = std::to_string(r) + hexa;
        }

        num = num / 16;
    }

    std::cout << "Number after conversion to Hexadecimal: " << hexa << std::endl;
}

void performOperation(int choice, int num) {
    std::cout << "Enter a number: ";
    std::cin >> num;

    std::cout << "587Choose an operation:\n";
    std::cout << "1. Decimal to Binary Conversion\n";
    std::cout << "2. Decimal to Octal Conversion\n";
    std::cout << "3. Decimal to Hexadecimal Conversion\n";
    std::cout << "Enter your choice (1-3): ";
    std::cin >> choice;

    switch (choice) {
        case 1:
            DecimalToBinary(num);
            break;
        case 2:
            DecimalToOctal(num);
            break;
        case 3:
            DecimalToHexadecimal(num);
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
