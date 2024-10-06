//Q1. Create a Hash table containing Employee name and Salary. Display the details of the hash
//table. 
//:-


import java.util.Hashtable;
import java.util.Scanner;

//Employee salary hash table
public class seven {
    public static void main(String[] args) {
        Hashtable<String, Double> employeeSalaries = new Hashtable<>();

        // Add employee names and salaries to the Hashtable
        employeeSalaries.put("John", 50000.0);
        employeeSalaries.put("Alice", 60000.0);
        employeeSalaries.put("Bob", 55000.0);
        employeeSalaries.put("Eve", 62000.0);

        // Display the details of the Hashtable
        System.out.println("Employee Details:");
        for (String employeeName : employeeSalaries.keySet()) {
            double salary = employeeSalaries.get(employeeName);
            System.out.println("Name: " + employeeName + ", Salary: $" + salary);
        }

    }
}
