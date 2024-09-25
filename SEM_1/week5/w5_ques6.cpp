//Addition and Multiplication of two Matrices

#include <iostream>
#include <vector>
using namespace std;

void matrix_mul(int m, int n, int p, const vector<vector<int>>& matrix1, const vector<vector<int>>& matrix2, vector<vector<int>>& matrix3){  // m = r1 , n = c1 , n = r2, p = c2 , m = r3/r1  p = c3/c2;

    for(int i = 0; i < m ; i++){
        for(int j = 0; j<p ;j++){
            matrix3[i][j] = 0;
            for(int k = 0; k<n;k++){
                matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
            }
        }
    }
}

void matrix_add(int m, int n, const vector<vector<int>>& matrix1, const vector<vector<int>>& matrix2, vector<vector<int>>& matrix3){


    for(int i = 0; i < m;i++){
        for(int j = 0; j<n; j++){
            matrix3[i][j] = matrix1[i][j]+matrix2[i][j];
        }
    }
}

void matrix_insert_elements(int m, int n, vector<vector<int>>& matrix){
    for (int i = 0; i < m;i++){
        for(int j = 0; j < n ;j++){
            cin >> matrix[i][j];
        }
        cout << "\n";
    }
}

void display_matrix_elements(int m, int n, vector<vector<int>>& matrix){

    for (int i = 0; i < m ; i++){
        for (int j = 0; j < n ;j++){
            cout << matrix[i][j] << "  ";
        }
        cout << "\n";
    }
}

int main(){

    int m, n, p;

    int sw;
    cout << "Select '1' for Matrix Multiplication and '2' for Matrix Addition:  ";
    cin >> sw;

    switch(sw){

        case 1: {
            cout << "\nMATRIX MULTIPLICATION";

            cout << "\nEnter Rows for first Matrix: ";
            cin >> m;

            cout << "Enter Columns for first Matrix: ";
            cin >> n;

            cout << "Enter Rows of Second Matrix: " << n;
            cout << "\nEnter Columns for second matrix: ";
            cin >> p;

            vector<vector<int>> matrix1_mul(m, vector<int>(n));
            vector<vector<int>> matrix2_mul(n, vector<int>(p));
            vector<vector<int>> result_mul(m, vector<int>(p));

            cout << "\nEnter elements for the first matrix:\n";
            matrix_insert_elements(m, n, matrix1_mul);

            cout << "\nEnter elements for the second matrix:\n";
            matrix_insert_elements(n, p, matrix2_mul);

            cout << "\nFirst matrix: \n";
            display_matrix_elements(m, n, matrix1_mul);

            cout << "\nSecond matrix: \n";
            display_matrix_elements(n, p, matrix2_mul);

            matrix_mul(m, n, p, matrix1_mul, matrix2_mul, result_mul);

            cout << "\nResulting Matrix after Multiplication:\n";
            display_matrix_elements(m, p, result_mul);


            break;
        }

        case 2: {

            cout << "\nMATRIX ADDITION";
            cout << "\nEnter rows for matrices: ";
            cin >> m;

            cout << "Enter columns for matrices: ";
            cin >> n;

            vector<vector<int>> matrix1_add(m, vector<int>(n));
            vector<vector<int>> matrix2_add(m, vector<int>(n));
            vector<vector<int>> result_add(m, vector<int>(n));


            cout << "\nEnter first matrix elements: \n";
            matrix_insert_elements(m, n, matrix1_add);

            cout << "\nEnter second matrix elements: \n";
            matrix_insert_elements(m, n, matrix2_add);

            cout << "\nFirst matrix: \n";
            display_matrix_elements(m, n, matrix1_add);

            cout << "\nSecond matrix: \n";
            display_matrix_elements(m, n, matrix2_add);

            matrix_add(m, n, matrix1_add, matrix2_add, result_add);

            cout << "\nResulting Matrix after Addition:\n";
            display_matrix_elements(m, n, result_add);

            break;
        }

        default:
            cout << "Select either 1 or 2.";
    }

    return 0;

}
