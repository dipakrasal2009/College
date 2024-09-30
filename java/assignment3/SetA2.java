import java.util.Hashtable;
import java.util.Scanner;

//employee Hash table
public class SetA2 {
    public static void main(String[] args) {
        Hashtable<String, Double> employees = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        
        // Adding employee data to the hash table
        employees.put("Dipak", 50000.0);
        employees.put("paratik", 60000.0);
        employees.put("vaibhav", 55000.0);
        employees.put("samir", 70000.0);
        
        // Displaying the hash table
        System.out.println("Employee Details:");
        employees.forEach((name, salary) -> {
            System.out.println("Employee: " + name + ", Salary: " + salary);
        });

        // Searching for an employee
        System.out.println("\nEnter the employee name to search:");
        String searchName = scanner.nextLine();
        if (employees.containsKey(searchName)) {
            System.out.println("Salary of " + searchName + ": " + employees.get(searchName));
        } else {
            System.out.println("Employee not found.");
        }
        
        scanner.close();
    }
}

