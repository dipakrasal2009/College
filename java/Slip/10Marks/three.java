//Q1. Write a program to accept the 'n' different numbers from user and store it in array. Also
//printthe sum of elements of the array. 
//:-
//
import java.util.Scanner;

sum of array list
public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of 'n'
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        // Create an array of size 'n'
        int[] arr = new int[n];

        // Prompt the user to enter 'n' different numbers and store them in the array
        System.out.println("Enter " + n + " different numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Print the elements of the array
        System.out.println("Elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print the sum of array elements
        System.out.println("\nSum of elements in the array: " + sum);

        scanner.close();
    }
}
