#include <iostream>

struct ComplexNum {
    int real;
    int imaginary;
};

void ReadComplexNum(ComplexNum &num) {
    std::cout << "Enter the real part of the complex number: ";
    std::cin >> num.real;
    std::cout << "Enter the imaginary part of the complex number: ";
    std::cin >> num.imaginary;
}

void DisplayComplexNum(const ComplexNum &num) {
    if (num.imaginary < 0) {
        std::cout << "\nYour Entered Number: " << num.real << num.imaginary << "i" << std::endl;
    }
    else if (num.real == 0 && num.imaginary == 0) {
        std::cout << "\nYour Entered Number: " << 0 << std::endl;
    }
    else if (num.real == 0) {
        std::cout << "\nYour Entered Number: " << num.imaginary << "i" << std::endl;
    }
    else if (num.imaginary == 0) {
        std::cout << "\nYour Entered Number: " << num.real << std::endl;
    }
    else {
        std::cout << "\nYour Entered Number: " << num.real << "+" << num.imaginary << "i" << std::endl;
    }
}

ComplexNum MulComplexNum(const ComplexNum &num1, const ComplexNum &num2) {
    ComplexNum result;
    result.real = (num1.real * num2.real) - (num1.imaginary * num2.imaginary);
    result.imaginary = (num1.real * num2.imaginary) + (num2.real * num1.imaginary);
    return result;
}

ComplexNum AddComplexNum(const ComplexNum &num1, const ComplexNum &num2) {
    ComplexNum result;
    result.real = num1.real + num2.real;
    result.imaginary = num1.imaginary + num2.imaginary;
    return result;
}

ComplexNum SubComplexNum(const ComplexNum &num1, const ComplexNum &num2) {
    ComplexNum result;
    result.real = num1.real - num2.real;
    result.imaginary = num1.imaginary - num2.imaginary;
    return result;
}

void DisplayResult(const ComplexNum &result, const std::string &operation) {
    if (result.imaginary < 0) {
        std::cout << "\nResult after " << operation << ": " << result.real << result.imaginary << "i" << std::endl;
    }
    else if (result.real == 0 && result.imaginary == 0) {
        std::cout << "\nResult after " << operation << ": " << 0 << std::endl;
    }
    else if (result.real == 0) {
        std::cout << "\nResult after " << operation << ": " << result.imaginary << "i" << std::endl;
    }
    else if (result.imaginary == 0) {
        std::cout << "\nResult after " << operation << ": " << result.real << std::endl;
    }
    else {
        std::cout << "\nResult after " << operation << ": " << result.real << "+" << result.imaginary << "i" << std::endl;
    }
}

int main() {
    ComplexNum num1, num2;
    ReadComplexNum(num1);
    ReadComplexNum(num2);
    DisplayComplexNum(num1);
    DisplayComplexNum(num2);

    ComplexNum mulResult = MulComplexNum(num1, num2);
    DisplayResult(mulResult, "Multiplication");

    ComplexNum addResult = AddComplexNum(num1, num2);
    DisplayResult(addResult, "Addition");

    ComplexNum subResult = SubComplexNum(num1, num2);
    DisplayResult(subResult, "Subtraction");

    return 0;
}
