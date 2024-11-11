/*
Create a union containing 6 strings: name, home_address, hostel_address, city,
state and zip. Write a C++ program to display your present address.
*/
#include <iostream>
#include <cstring>

struct Address {
    char name[50];
    char home_address[100];
    char hostel_address[100];
    char city[50];
    char state[50];
    char zip[10];
};

void InsertDetails(Address &add) {
    std::cout << "Insert your name: ";
    std::cin.getline(add.name, 50);

    std::cout << "Insert your present home address (or skip if present address is hostel address): ";
    std::cin.getline(add.home_address, 100);

    std::cout << "Insert your present hostel address: (or skip if present address is hostel address):";
    std::cin.getline(add.hostel_address, 100);

    std::cout << "Insert your present city: ";
    std::cin.getline(add.city, 50);

    std::cout << "Insert your state: ";
    std::cin.getline(add.state, 50);

    std::cout << "Insert your ZIP: ";
    std::cin.getline(add.zip, 10);
}

void DisplayAddress(const Address &add) {
    std::cout << "\nPresent Address of " << add.name << std::endl;
    if (strlen(add.hostel_address) == 0) {
        std::cout << add.home_address << ", " << add.city << ", " << add.state << ", " << add.zip << std::endl;
    } else {
        std::cout << add.hostel_address << ", " << add.city << ", " << add.state << ", " << add.zip << std::endl;
    }
}

int main() {
    Address add1, add2;

    std::cout << "Enter details for Address 1:" << std::endl;
    InsertDetails(add1);

    std::cout << "\nEnter details for Address 2:" << std::endl;
    InsertDetails(add2);

    std::cout << "\n--- Displaying Addresses ---" << std::endl;
    DisplayAddress(add1);
    DisplayAddress(add2);

    return 0;
}
