/*
 * Question:
Write a Java program to calculate the factorial of a predefined number. 
The program should:

Use a predefined integer value (e.g., 4).
Compute the factorial of that number using a loop.
Display the result on the console.
 */

 //SOLUTION

 public class FactorialPredefined {
    public static void main(String[] args) {
        int num = 4;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

/*
 * OUTPUT
Factorial of 4 is: 24
 */