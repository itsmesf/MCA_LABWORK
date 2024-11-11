/*
 Write a C++ program to define a structure named D.O.B., which contains name,
day, month and year. Using the concept of nested structures display your name
and date of birth.
*/
#include <iostream>
#include <cstring>

struct DOB{

    std::string name;
    int day;
    int month;
    int year;

};

struct person{
    std::string name;
    DOB dob;
};

void InsertDetails(person &p){
    std::cout << "Enter your Name: ";
    getline(std::cin , p.name);

    std::cout << "Enter your date of birth (day month year): ";
    std::cin >> p.dob.day >> p.dob.month >> p.dob.year;
}


void displayDetails(person &p){
    std::cout << "Date of Birth of " << p.name << " is " << p.dob.day << "/"<< p.dob.month << "/" << p.dob.year;
    std::cout << std::endl;
}


int main(){
    person p1;
    InsertDetails(p1);
    displayDetails(p1);

    return 0;
}