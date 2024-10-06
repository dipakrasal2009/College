//Q1. Create a package named “Series” having a class to print series of Square of numbers. Write a
///program to generate “n” terms series. 
//:-
//
package Series;

public class SquareSeries {
    public static void printSquareSeries(int n) {
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
    }
}


//import Series.SquareSeries;

 class twelve {
    public static void main(String[] args) {
        int n = 10; // You can change 'n' to the number of terms you want in the series

        System.out.println("Square Series for " + n + " terms:");
        SquareSeries.printSquareSeries(n);
    }
}

