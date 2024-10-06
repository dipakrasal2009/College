//Q1. Write a program to accept a number from user. Check whether number is perfect or not. Use BufferedReader class for accepting input from user. [10 Marks]
//:-
//
//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//perfect number
public class nine {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i != num) {
                    sum = sum + i + num / i;
                } else {
                    sum = sum + i;
                }
            }
        }

        return sum == num;
    }
}

