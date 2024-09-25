//length = 10; atleast one uppercase, lowercase, number, special symbol;

#include <iostream>
#include <cstdlib>
#include <ctime>
#include <string>

bool isCharUnique(const std::string& password, char newChar) {
    // Manually check if the character is already present in the password
    for (int i = 0; i < password.length(); i++) {
        if (password[i] == newChar) {
            return false;  // Character is not unique
        }
    }
    return true;  // Character is unique
}

int main() {
    std::string password = "";
    srand(unsigned(time(0)));  // Seed the random number generator
    std::string specialSymbols = "!@#$%^&*";

    while (password.length() < 10) {
        char newChar;
        int charType = rand() % 4;  // Randomly select type of character (0-Uppercase, 1-Lowercase, 2-Digit, 3-Special)

        // Generate a character based on the random type
        if (charType == 0) {
            newChar = (char)((rand() % 26) + 65);  // Uppercase letter (A-Z)
        } else if (charType == 1) {
            newChar = (char)((rand() % 26) + 97);  // Lowercase letter (a-z)
        } else if (charType == 2) {
            newChar = (char)((rand() % 10) + 48);  // Digit (0-9)
        } else {
            newChar = specialSymbols[rand() % specialSymbols.length()];  // Special symbol
        }

        // Only add the character if it is unique
        if (isCharUnique(password, newChar)) {
            password += newChar;
        }

    }

    std::cout << "\nPassword: " << password << std::endl;

    return 0;
}
