/*
 * Problem Statement:
Write a Java program to check whether a given number is a palindrome or not.
 A palindrome number is a number that remains the same when its digits are reversed.

Constraints:
The input will be a positive integer.
The program should check if the number is the same when read forward and backward.
 */

 //SOLUTION
 import java.util.Scanner;

 public class PalindromeNumber {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         sc.close();
 
         if (isPalindrome(num)) {
             System.out.println("Palindrome Number");
         } else {
             System.out.println("Not a Palindrome Number");
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
 

/*OUTPUT
Enter a number: 121
Palindrome Number
*/