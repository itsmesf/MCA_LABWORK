//display reverse string using pointers(char arrays)

#include<iostream>

void reverseStr(char *ptr){
    char* begin = ptr, *end = ptr; // both of them will point to the first character

    while (*end!='\0'){
        end++;
    }
    end--;

    while(begin <  end){  //swapping takes place till middle character(index)
        char temp = *begin;
        *begin = *end;
        *end = temp;

        begin++;
        end--;
    }
}


int main(){

    char str[50];

    std::cout << "Enter a string: ";
    std::cin.getline(str, 50);

    reverseStr(str);

    std::cout << "Reversed string: "  << str;

    return 0;
}
