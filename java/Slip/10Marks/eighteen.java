//Q1. Write a program to print the factors of a number. Accept a number using command line
//argument.
//:-

//factorOfNumber
public class eighteen {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FactorsOfNumber <number>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            System.out.print("Factors of " + number + ": ");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
