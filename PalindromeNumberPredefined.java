/*
 * Write a Java program with a predefined number to check whether it is a palindrome or not. A palindrome number is a number that remains the same when its digits are reversed. The program should not take input from the user; instead, it should check a fixed number defined in the code.

Constraints:
The number is predefined in the program (not user input).
The program should correctly determine if the number is the same when reversed.
 */

 // SOLUTION
 public class PalindromeNumberPredefined {
    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is Not a Palindrome Number");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}

/*
 * OUTPUT
121 is a Palindrome Number
 */