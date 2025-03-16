/*
 * Write a simple Java program to check whether a given string is a palindrome. 
 * A palindrome is a word that reads the same forward and backward.
 */


//SOLUTION
public class SimplePalindrome {
    public static void main(String[] args) {
        String str = "madam";
        
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
 * output
 * 
 * Palindrome
 */