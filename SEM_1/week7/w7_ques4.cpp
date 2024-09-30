/*4# Write a C++ program to create three objects for a class named pntr_obj with data
members such as roll_no & name. Create a member function set_data() for setting the
data values and print() member function to print which object has invoked it using the
‘this’ pointer*/

#include <iostream>

class pntr_obj {

private:
    int roll_no;
    std::string name;

public:

    void set_data(){
        std::cout<<"\nEnter Roll No: ";
        std::cin >> roll_no;
        std::cin.ignore();
        std::cout << "Enter Name: ";
        getline(std::cin, name);
        std::cout << std::endl;
    }

    void print(){
        std::cout << "Object at address: " << this << std::endl;
        std::cout << "Roll No: " << roll_no << std::endl;
        std::cout << "Name: " << name << std::endl;
        std::cout << std::endl;
    }

};

int main(){

    //Creating objects

    pntr_obj obj1, obj2, obj3;

    //set data for each object by taking user input

    std::cout << "Enter data for first object";
    obj1.set_data();
    std::cout << "Enter data for second object";
    obj2.set_data();
    std::cout << "Enter data for third object";
    obj3.set_data();

    //Displaying data

    obj1.print();
    obj2.print();
    obj3.print();

    return 0;
}