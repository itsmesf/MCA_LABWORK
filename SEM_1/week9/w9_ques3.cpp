//Write a C++ program to print the transpose of a given matrix using function.

#include <iostream>
#include <vector>

void transposeMatrix(int m, int n, std::vector<std::vector<int>>& matrix, std::vector<std::vector<int>>& transpose){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m ;j++){
            transpose[i][j] = matrix[j][i];
        }
    }
}

void insertElementMatrix(int m, int n, std::vector<std::vector<int>>& matrix){
    for(int i = 0; i < m;i++){
        for(int j = 0; j < n; j++){
            std::cin >> matrix[i][j];
        }
        std::cout << std::endl;
    }
}

void displayElementMatrix(int m, int n, std::vector<std::vector<int>>& matrix){
    for(int i = 0; i < m;i++){
        for(int j = 0; j < n; j++){
            std::cout << matrix[i][j] << "  ";
        }
        std::cout << std::endl;
    }
}

int main(){

    int m, n;

    std::cout << "Enter number of rows to be inserted in a matrix:  ";
    std::cin >> m;

    std::cout << "Enter number of columns to be inserted in a matrix:  ";
    std::cin >> n;

    std::vector<std::vector<int>> matrix(m, std::vector<int>(n));
    std::vector<std::vector<int>> transpose(n,std::vector<int>(m));

    std::cout << "Insert matrix elements: ";
    insertElementMatrix(m,n, matrix);

    std::cout << "\nMatrix: " << std::endl;
    displayElementMatrix(m,n,matrix);

    transposeMatrix(m, n, matrix, transpose);
    std::cout << "\nTranspose of Matrix: " << std::endl;
    displayElementMatrix(n, m, transpose);

    return 0;
}