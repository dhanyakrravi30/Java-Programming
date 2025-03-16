/*
 *Problem Statement:
  Write a Java program to find the largest element in a given array.
  The program should initialize an integer array with predefined values 
  and determine the maximum element in the array.
 */

 //SOLUTION

 public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 25, 6, 98, 45}; 
        int max = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }

        System.out.println("Largest element: " + max);
    }
}

/*OUTPUT

Largest element: 98

*/


