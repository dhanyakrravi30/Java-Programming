/*
Write a Java program to calculate the factorial of a given number using recursion. 
The program should:

Take an integer input from the user.
Use a recursive function to calculate the factorial of the given number.
Display the factorial as output.
 */


//SOLUTION

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1)  
            return 1;  
        return n * factorial(n - 1);  
    }
}

/*
 * OUTPUT
 * Enter a number: 5
 * Factorial of 5 is: 120
 */