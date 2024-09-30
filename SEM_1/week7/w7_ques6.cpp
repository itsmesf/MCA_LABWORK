/*
 * Write a C++ program to implement flight class with data member as flight_no., source
 * destination and fare. Write a member function to display the flight information using this
 * pointer
 */

#include <iostream>

class flight{

private:
    int flight_no;
    std::string source;
    std::string destination;
    unsigned int fare;

public:

    void setData(){
        std::cout << "Enter flight Number: ";
        std::cin >> flight_no;

        std::cin.ignore();

        std::cout << "Enter source: ";
        getline(std::cin, source);


        std::cout << "Enter destination: ";
        getline(std::cin, destination);


        std::cout << "Enter fare: ";
        std::cin >> fare;

        std::cout << std::endl;

    }

    void displayData(){

        std::cout << "\nFlight Number: " << this->flight_no << std::endl;
        std::cout << "Source: " << this->source << std::endl;
        std::cout << "Destination: " << this->destination << std::endl;
        std::cout << "Fare: " << this->fare << std::endl;

    }
};

int main(){

    flight obj;

    obj.setData();
    obj.displayData();
}
