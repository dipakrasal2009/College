//Q1. Accept 'n' integers from the user and store them in a collection. Display them in the sorted order. The collection should not accept duplicate elements. (Use a suitable collection). Search for a particular
//element using predefined search method in the Collection framework. 
//:-
//

import java.util.Scanner;
import java.util.TreeSet;

//sorted unic collection

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();

        // Accept n integers from the user
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Display them in sorted order (automatically sorted due to TreeSet)
        System.out.println("Sorted and unique integers: " + numbers);

        // Search for a particular element
        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();

        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is found in the collection.");
        } else {
            System.out.println(searchElement + " is not found in the collection.");
        }

        scanner.close();
    }
}
