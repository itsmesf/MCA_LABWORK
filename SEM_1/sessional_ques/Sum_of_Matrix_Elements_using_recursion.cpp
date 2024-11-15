
#include <iostream>

const int ROWS = 3;
const int COLUMNS = 3;

int sumMatrixElements(int matrix[ROWS][COLUMNS], int rows, int cols){
    
    
    if(rows==ROWS){
        return 0;
    }
    
    if(cols==COLUMNS){
        return sumMatrixElements(matrix, rows+1, 0);
    }
    
    return matrix[rows][cols]+sumMatrixElements(matrix,rows,cols+1);
    
}

int main()

{
    
    int matrix[ROWS][COLUMNS] = {{1,1,1},
    {1,1,1},
    {1,1,1}};
    
    std::cout<<"Sum of matrix Elements: " << sumMatrixElements(matrix, 0, 0);;

    return 0;
}
