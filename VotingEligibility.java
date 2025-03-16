/*
 * Write a Java program that checks if a person is eligible to vote based on their predefined age. A person is eligible to vote if their age is 18 or older.
 *  The program should use a fixed age value instead of user input.

Constraints:
The age is predefined in the program.
If the age is 18 or more, print "Eligible to vote".
If the age is less than 18, print "Not eligible to vote".
 */

 //SOLUTION
 public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}

/*
 * Output:
 * Eligible to vote
 */