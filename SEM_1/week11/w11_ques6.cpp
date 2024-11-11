#include <iostream>

class BankAccount{

private:
    std::string name;
    int accountNumber;
    std::string accountType;
    double balance;


public:

    void setDetails(){
        std::cout << "Enter customer Name: ";
        getline(std::cin, name);

        std::cout << "Enter Customer Account Number: ";
        std::cin >> accountNumber;

        std::cout << "Enter Customer Account Type: ";
        std::cin >> accountType;

        std::cout << "Enter Initial Balance: ";
        std::cin>> balance;
    }
    BankAccount(){
        name = "";
        accountNumber = 0;
        accountType = "";
        balance = 0.0;
    }

    void DisplayAccountDetails(){
        std::cout << "Name: " << name << std::endl;
        std::cout << "Account Number: " << accountNumber << std::endl;
        std::cout << "Account Type: " << accountType << std::endl;
        std::cout << "Balance: " << balance << std::endl;
    }

    void depositAmount() {
        double amount;
        std::cout << "\nEnter amount to be deposited: ";
        std::cin >> amount;

        if (amount > 0) {
            balance += amount;
            std::cout << "New Balance after depositing money: " << balance << std::endl;
        } else {
            std::cout << "Invalid deposit amount!" << std::endl;
        }
    }

    void withdrawAmount() {
        double amount;
        std::cout << "\nEnter amount to withdraw: ";
        std::cin >> amount;

        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                std::cout << "New Balance after withdrawing money: " << balance << std::endl;
            } else {
                std::cout << "Transaction Failed!! Insufficient balance" << std::endl;
            }
        } else {
            std::cout << "Invalid withdrawal amount!" << std::endl;
        }
    }
};

int main(){

    BankAccount customer1;
    std::cout << "Enter details of CUSTOMER 1"  << std::endl;
    customer1.setDetails();
    customer1.DisplayAccountDetails();
    customer1.depositAmount();
    customer1.withdrawAmount();
}