//Q1. Define a class MyNumber having one private integer data member. Write a parameterized
//constructor to initialize to a value. Write isEven() to check given number is even or not. Use command
//line argument to pass a value to the object.
//:-
//MyNumEven
public class sixteen {
    private int value;

    public sixteen(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer as a command line argument.");
            return;
        }

        try {
            int inputValue = Integer.parseInt(args[0]);
            sixteen myNumber = new sixteen(inputValue);

            if (myNumber.isEven()) {
                System.out.println(inputValue + " is an even number.");
            } else {
                System.out.println(inputValue + " is not an even number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}

