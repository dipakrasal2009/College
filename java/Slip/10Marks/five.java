//Q1. Write a program to accept a number from the user, if number is zero then throw user defined
//exception ―Number is 0, otherwise display factorial of a number. 
//:-


import java.util.Scanner;

// Custom exception class for a number being zero
class NumberIsZeroException extends Exception {
    public NumberIsZeroException() {
        super("Number is 0");
    }
}

// factore calculator
public class five {
    // Function to calculate the factorial of a number
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                throw new NumberIsZeroException();
            } else {
                long factorial = calculateFactorial(num);
                System.out.println("Factorial of " + num + " is: " + factorial);
            }
        } catch (NumberIsZeroException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
