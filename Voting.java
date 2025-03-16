/*
 * Write a Java program that asks the user to enter their age and checks if they are eligible to vote.
 *  A person is eligible to vote if their age is 18 or older.
 */

 //SOLUTION
 import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        scanner.close();
    }
}


/*
 * Output:
 * Enter your age: 20
 * Eligible to vote
 */