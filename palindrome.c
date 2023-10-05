#include <stdio.h>
#include <string.h>

// Function to check if a string is a palindrome
int isPalindrome(char *str) {
    int left = 0;
    int right = strlen(str) - 1;
    
    while (left < right) {
        if (str[left] != str[right]) {
            return 0; 
          // Not a palindrome
        }
        left++;
        right--;
    }
    
    return 1; // It's a palindrome
}

int main() {
    char str[100];
    
    printf("Enter a string: ");
    gets(str);
    
    if (isPalindrome(str)) {
        printf("It's a palindrome.\n");
    } else {
        printf("It's not a palindrome.\n");
    }
    
    return 0;
}
