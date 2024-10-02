//Write a C++ program that reads a line of text and counts all occurrence of a particular word

#include <iostream>
#include <sstream>
#include <string>
#include <algorithm>


std::string removePunctuation(const std::string& line) {
    std::string result;
    for (int i = 0; i < line.length(); i++) {
        if (!ispunct(line[i])) {
            result += line[i];
        }
    }
    return result;
}

std::string toLower(const std::string& str){
    std::string result = str;
    transform(result.begin(), result.end(), result.begin(),::tolower);
    return result;
}

int countOccurrences(const std::string& line, const std::string& word) {

    std::string cleanLine = removePunctuation(line);
    std::stringstream ss(cleanLine);
    std::string temp;
    int count = 0;

    while (ss >> temp) {
        if (toLower(temp) == toLower(word)) {
            count++;
        }
    }

    return count;
}

int main() {
    std::string line, word;

    std::cout << "Enter a line of text: ";
    getline(std::cin, line);

    std::cout << "Enter the word to count: ";
    std::cin >> word;

    std::cout << "The word '" << word << "' occurs " << countOccurrences(line, word) << " times." << std::endl;

    return 0;
}

/*
 * The stringstream object ss is created from the line string.
 * A stringstream allows the program to split the line into individual words by treating the line as a stream.
 * A temporary string variable temp is declared.
 * It will be used to hold individual words as they are extracted from the stringstream.
 * This is a while loop that extracts words from the stringstream ss one by one. Each word is stored in temp.
 * The loop continues as long as there are more words to extract.
 */

/*
* transform(result.begin(), result.end(), result.begin(), ::tolower);
* This line is the core part of the function, which converts all characters of the result string to lowercase.
* result.begin(): This points to the beginning of the result string.
* result.end(): This points to the position just after the last character of the result string.
* The std::transform function is used to apply a transformation to each character in the range [result.begin(), result.end()).
* result.begin(): This specifies where to store the transformed characters (overwriting the original string in result).
* ::tolower: This is a function pointer to the tolower function from the C++ standard library, which converts a
* character to its lowercase form.
* How std::transform works:
* std::transform iterates over each character in the result string, applies the tolower function to each character, and
* writes the result back into the same string (result).
* ::tolower converts each character to lowercase. The double colon (::) is used to refer to the global tolower function from
* the C standard library.
*/
