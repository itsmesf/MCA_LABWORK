#include <iostream>

int main() {
    std::string name, branch;
    int year;

    std::cout << "Enter your name: ";
    getline(std::cin, name);

    std::cout << "Enter your branch: ";
    getline(std::cin, branch);

    std::cout << "Enter your year: ";
    std::cin >> year;

    std::cout << "Name: " << name << std::endl;
    std::cout << "Branch: " << branch << std::endl;
    std::cout << "Year: " << year << " Year" << std::endl;

    return 0;
}
