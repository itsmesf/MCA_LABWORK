/*
2# Write a C++ program to compute the monthly pay of 100 employees using each
employee’s name, basic pay. The DA is computed as 52% of the basic pay.
Gross-salary (basic pay + DA). Print the employees name and gross salary.
*/

#include<iostream>
#include<string>
#include <vector>

struct Employee{
    std::string name;
    double basicPay;
    double GrossSalary;
};

void InsertEmpDetails(Employee &emp){

    std::cout << "Enter employee Name: ";
    std::cin.ignore();
    getline(std::cin, emp.name);
    std::cout << "Enter Basic Pay: ";
    std::cin >> emp.basicPay;

}

void GrossSalary(Employee &emp){

    double DA = 0.52 * emp.basicPay;
    emp.GrossSalary = emp.basicPay + DA;

}

void DisplayEmployeeDetails(const Employee &emp) {
    std::cout << "Employee Name: " << emp.name << ", Gross Salary: " << emp.GrossSalary << std::endl;
}

int main(){
    int EmpNum;
    std::cout << "Enter number of employees data you want to insert: ";
    std::cin >> EmpNum;

    std::vector<Employee> employee(EmpNum);

    //Insert Employee DisplayEmployeeDetails
    for(int i  = 0 ; i <EmpNum ; i++){
        std::cout << "Insert Details for Employee" << i+1 << std::endl;
        InsertEmpDetails(employee[i]);
        GrossSalary(employee[i]);
    }

    //Display Details

    std::cout << "-----------Gross Salary of Employees-----------" << std::endl;
    std::cout << std::endl;

    for(int i = 0; i <EmpNum ; i++){
        DisplayEmployeeDetails(employee[i]);
    }
    return 0;

}