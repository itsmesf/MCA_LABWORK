#include <iostream>
using namespace std;

const int rows = 3;
const int cols = 3;

void displayMatrix(int matrix[rows][cols], int r, int c) {

	if(r == rows) return;

	if (c == cols) {
		cout<< endl;
		displayMatrix(matrix,r+1,0);
		return;
	}

	cout<< matrix[r][c]<<"  ";

	return displayMatrix(matrix,r,c+1);

}

int main() {

	int matrix[rows][cols] = {{1,2,3}, {4,5,6},
{7,8,9}
};

	displayMatrix(matrix,0,0);

	return 0;
}
