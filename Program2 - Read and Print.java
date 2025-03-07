// Task
The given task is to take an integer as input from the user and
print that integer in Java language. 


import java.io.*;
import java.util.Scanner;

public class Integer {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the integer value:  ");

        Scanner s = new Scanner(System.in);

        num = s.nextInt();

        System.out.println("The number is : " + num);

        s.close();
    }
}



/* OUTPUT
Enter the integer value:  
2
The number is : 2

*/
