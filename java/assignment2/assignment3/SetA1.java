import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>(); // TreeSet will sort the numbers and eliminate duplicates
        
        System.out.println("Enter the number of integers you want to input:");
        int n = scanner.nextInt();
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Sorted unique numbers: " + numbers);

        // Searching for an element
        System.out.println("Enter the number to search:");
        int searchNumber = scanner.nextInt();
        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is present in the collection.");
        } else {
            System.out.println(searchNumber + " is not present in the collection.");
        }

        scanner.close();
    }
}

