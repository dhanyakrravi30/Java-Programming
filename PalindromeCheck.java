/*
 * Problem Statement:
Write a Java program to check whether a given string is a palindrome or not. 
A palindrome is a word, phrase, or sequence that reads the same forward and backward.

Constraints:
The input will be a single word (without spaces).
The program should be case-sensitive (e.g., "Madam" is not the same as "madam").
 */

 //SOLUTION
 import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
 * OUTPUT
Enter a string: madam
Palindrome
 */