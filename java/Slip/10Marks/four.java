//Q1. Write a program to accept the user name and greets the user by name. Before displaying the
//user's name, convert it to upper case letters. For example, if the user's name is Raj, then display
//greet message as "Hello, RAJ, nice to meet you!". 
//:-
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        // Convert the user's name to uppercase
        String upperCaseName = userName.toUpperCase();

        // Display the greeting message
        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

        // Close the scanner
        scanner.close();
    }
}

