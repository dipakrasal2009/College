//Q1. Write a program to reverse a number. Accept number using command line argument. [10 Marks]
//:-
//Reverse number
public class ReverseNumber {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single number as a command-line argument.");
            return;
        }

        String input = args[0];
        try {
            int number = Integer.parseInt(input);
            int reversedNumber = reverseNumber(number);
            System.out.println("Original Number: " + number);
            System.out.println("Reversed Number: " + reversedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid number.");
        }
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}

