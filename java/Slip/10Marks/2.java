//Q1. Write a program to accept ‘n’ integers from the user & store them in an Array List collection. 
//Display the elements of Array List.
//:-
import java.util.ArrayList;
import java.util.Scanner;

public class 2 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        // Read 'n' integers from the user and add them to the ArrayList
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            arrayList.add(num);
        }

        // Close the scanner
        scanner.close();

        // Display the elements of the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Element " + (i + 1) + ": " + arrayList.get(i));
        }
    }
}
