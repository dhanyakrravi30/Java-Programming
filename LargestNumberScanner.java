/*
 * Problem Statement:
Write a Java program to find the largest element in an array.
The program should:

Take the size of the array as input from the user.
Accept n integer values from the user and store them in an array.
Find and display the largest element in the array.
 * 
 */

 //SOLUTION
 import java.util.Scanner;

public class LargestNumberScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();  

        int[] arr = new int[n];  

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }

        int max = arr[0];  
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }

        System.out.println("Largest element: " + max);
        sc.close();  
    }
}


/*
 * OUTPUT
 * 
Enter the number of elements: 5
Enter 5 elements:
10 25 6 98 45
Largest element: 98

 */