/*
 * Java Program to Check Palindrome (Case-Insensitive)
 */

 // SOLUTION

 import java.util.Scanner;

public class PalindromeIgnoreCase {
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
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive check
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

/* OUTPUT
Enter a string: Madam
Palindrome

*/
