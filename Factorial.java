
/*
Write a simple Java program to find the factorial of a given number. 
The program should:

Take an integer input from the user.
Calculate the factorial of the given number using a loop.
Display the factorial as output.
 */


//SOLUTION
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

/*OUTPUT
Enter a number: 4
Factorial of 4 is: 24

*/