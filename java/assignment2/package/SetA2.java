import Series.fibonacci;
import Series.cube;
import Series.squar;
import java.util.Scanner;

public class SetA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept n from user
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Create objects of the classes in the Series package
        fibonacci fib = new fibonacci();
        cube cubee = new cube();
        squar square = new squar();

        // Generate and print the series
        fib.printFibonacci(n);
        cubee.printCubes(n);
        square.printSquares(n);

        scanner.close();
    }
}

