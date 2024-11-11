/*
Create a Book structure containing book_id, title, author name and price. Write
        a C++ program to pass a structure as a function argument and print the book
details.
*/

#include<iostream>

struct Book{
    int book_id;
    std::string title;
    std::string author_name;
    double price;
};

void InsertBookDetails(Book &book){

    std::cout << "Insert Book ID: ";
    std::cin>>book.book_id;

    std::cin.ignore();

    std::cout << "Insert Book Title: ";
    getline(std::cin, book.title);
    std::cout << "Insert Book Author: ";
    getline(std::cin, book.author_name);
    std::cout << "Insert Book Price: ";
    std::cin >> book.price;

}

void DisplayBookDetails(Book &book){

    std::cout << "Book Id: " << book.book_id << std::endl;
    std::cout << "Book Title: " << book.title << std::endl;
    std::cout << "Book Author: " << book.author_name << std::endl;
    std::cout << "Book Price: " <<book.price << std::endl;

    std::cout << std::endl;
}


int main(){

    Book book1, book2;

    std::cout << "Enter details for BOOK1" << std::endl;
    InsertBookDetails(book1);
    std::cout << "\nEnter details for BOOK2" << std::endl;
    InsertBookDetails(book2);

    std::cout << "BOOK1" << std::endl;
    DisplayBookDetails(book1);
    std::cout << "\nBOOK2" << std::endl;
    DisplayBookDetails(book2);

    return 0;
}