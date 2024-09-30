#include <iostream>
#include <string>

using namespace std;

int main(){
    string str1,str2;

    cout <<"Enter first String: ";
    getline(cin, str1);

    cout << "Enter second String: ";
    getline(cin, str2);

    string *s1 = &str1;
    string *s2 = &str2;
 
    string result = (*s1)+(*s2);

    cout << "\nConcatenated string: "<< result;
    return 0;
}