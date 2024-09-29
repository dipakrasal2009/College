import Series.Fibonacci;
import Series.Cube;
import Series.Square;
import java.util.Scanner;

public class SetA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept n from user
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Create objects of the classes in the Series package
        Fibonacci fibonacci = new Fibonacci();
        Cube cube = new Cube();
        Square square = new Square();

        // Generate and print the series
        fibonacci.printFibonacci(n);
        cube.printCubes(n);
        square.printSquares(n);

        scanner.close();
    }
}

