
#include <iostream>

class ObjectCounter {

public:
    static int createdCount;
    static int destroyedCount;

    // Constructor
    ObjectCounter() {
        createdCount++;
        std::cout << "Object created. Total objects created: " << createdCount << std::endl;
    }

    // Destructor
    ~ObjectCounter() {
        destroyedCount++;
        std::cout << "Object destroyed. Total objects destroyed: " << destroyedCount << std::endl;
    }
};

// Initialize static members
int ObjectCounter::createdCount = 0;
int ObjectCounter::destroyedCount = 0;

int main() {
    std::cout << "Entering main block." << std::endl;
    ObjectCounter obj1;

    {
        std::cout << "\nEntering inner block." << std::endl;
        ObjectCounter obj2, obj3;
        std::cout << "\nExiting inner block." << std::endl;
    }

    std::cout << "\nExiting main block." << std::endl;
    return 0;
}
