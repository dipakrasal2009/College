//Q1. Write a program to accept 3 numbers using command line argument. Sort and display the
//numbers. 
//:-
public class accept3num {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java SortNumbers <num1> <num2> <num3>");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            // Sort the numbers in ascending order
            int[] sortedNumbers = { num1, num2, num3 };
            java.util.Arrays.sort(sortedNumbers);

            System.out.println("Sorted Numbers: " + sortedNumbers[0] + ", " + sortedNumbers[1] + ", " + sortedNumbers[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}

