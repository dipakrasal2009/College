//Q1. Define a class MyNumber having one private integer data member. Write a parameterized
//constructor to initialize to a value. Write isOdd() to check given number is odd or not. Use commandline
//argument to pass a value to the object. 
//:-
//Mynumber
public class seventeen {
    private int number;

    public seventeen(int value) {
        number = value;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int value = Integer.parseInt(args[0]);
                seventeen myNumber = new seventeen(value);

                if (myNumber.isOdd()) {
                    System.out.println(value + " is an odd number.");
                } else {
                    System.out.println(value + " is not an odd number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide a valid integer.");
            }
        } else {
            System.out.println("Usage: java MyNumber <integer>");
        }
    }
}

