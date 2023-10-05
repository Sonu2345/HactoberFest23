#include <stdio.h>
#include <string.h>
#include <ctype.h>

int isPalindrome(const char *str) {
    int left = 0;
    int right = strlen(str) - 1;

    while (left < right) {
        char leftChar = tolower(str[left]);
        char rightChar = tolower(str[right]);

        if (!isalnum(leftChar)) {
            left++;
        } else if (!isalnum(rightChar)) {
            right--;
        } else if (leftChar != rightChar) {
            return 0; // not palindrome
        } else {
            left++;
            right--;
        }
    }

    return 1; // Palindrome
}

int main() {
    const char *inputStr = "madam"; // change input
    if (isPalindrome(inputStr)) {
        printf("%s is palindrome.\n", inputStr);
    } else {
        printf("%s not palindrome.\n", inputStr);
    }

    return 0;
}
