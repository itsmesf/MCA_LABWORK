#include <iostream>
using namespace std;

void character_using_ifElse(unsigned char a){

    int ascii = a;
    if (ascii >= 65 and ascii <= 90){
        cout << "Character entered is a capital letter.";
    }

    else if (ascii >= 97 and ascii <= 122){
        cout << "Character entered is a small case letter.";
    }

    else if (ascii >= 48 and ascii <= 57){
        cout << "Character entered is a number.";
    }

    else{
        cout << "Character entered is a special symbol.";
    }
}

void character_using_switchCase(char ch){

    switch(ch){
        case 'A'...'Z':
            cout << "Character entered is a capital letter.";
            break;

        case 'a'...'z':
            cout << "Character entered is a small letter";
            break;

        case '0'...'9':
            cout << "Character entered is a number";
            break;

        default:
            cout << "Character entered is a special symbol.";
    }
}

int main(){
    char x;
    int sw;
    char choice;

    cout << "Which method to use SWITCH CASE (1) or IF-ELSE (2): ";
    cin >> sw;

        switch (sw) {
            case 1:
                do {
                    cout << "Enter a character: ";
                    cin >> x;
                    character_using_switchCase(x);

                    cout << "\n\nDo you want to check another character? (y/n): ";
                    cin >> choice;
                }

                while(choice == 'y' || choice == 'Y');
                break;

            case 2:

                do{
                    cout << "\nEnter a character: ";
                    cin >> x;
                    character_using_ifElse(x);

                    cout << "\n\nDo you want to check another character? (y/n): ";
                    cin >> choice;
                }
                while(choice == 'y' || choice == 'Y');
                break;

            default:
                cout << "Wrong input\n";
        }

    return 0;
}