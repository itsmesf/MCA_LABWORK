#include <iostream>

void BubbleSort(int n, int array[]) {
    for (int i = 0; i < n - 1; i++) {
        bool swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break;
    }
}

int BinarySearch(int n, int array[], int item) {
    int begin = 0, end = n - 1;

    while (begin <= end) {
        int mid = begin + (end - begin) / 2;
        if (array[mid] == item) {
            return mid;
        } else if (item > array[mid]) {
            begin = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}

int main() {
    int n;

    std::cout << "Enter number of elements to be inserted in array: ";
    std::cin >> n;

    int array[n];

    std::cout << "Insert Array Elements: ";
    for (int i = 0; i < n; i++) {
        std::cin >> array[i];
    }

    BubbleSort(n, array);

    int item;
    std::cout << "Enter item to be searched in an array: ";
    std::cin >> item;

    int ItemIdx = BinarySearch(n, array, item);

    if (ItemIdx == -1) {
        std::cout << "Element does not exist in the array." << std::endl;
    } else {
        std::cout << "Element " << item << " is found at index(es): ";
        for (int i = ItemIdx; i < n && array[i] == item; i++) {
            std::cout << i << " ";
        }
        std::cout << std::endl;
    }

    return 0;
}
