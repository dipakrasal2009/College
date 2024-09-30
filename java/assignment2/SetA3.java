import java.util.Scanner;

// Base class Employee
class Employee {
    protected int id;
    protected String name;
    protected double salary;

    // Default constructor
    public Employee() {
        this.id = 0;
        this.name = "";
        this.salary = 0.0;
    }

    // Method to accept employee details
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

// Subclass Manager (extends Employee)
class Manager extends Employee {
    private double bonus;

    // Default constructor
    public Manager() {
        super();
        this.bonus = 0.0;
    }

    // Method to accept manager details including bonus
    @Override
    public void accept() {
        super.accept();  // Call Employee's accept method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager Bonus: ");
        bonus = sc.nextDouble();
    }

    // Method to display manager details including total salary
    @Override
    public void display() {
        super.display();  // Call Employee's display method
        System.out.println("Manager Bonus: " + bonus);
        System.out.println("Total Salary (Salary + Bonus): " + (salary + bonus));
    }

    // Method to get the total salary (salary + bonus)
    public double getTotalSalary() {
        return salary + bonus;
    }
}

// Main class
public class SetA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Managers: ");
        int n = sc.nextInt();

        // Create an array of Manager objects
        Manager[] managers = new Manager[n];

        // Accept details for each manager
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Manager " + (i + 1) + ":");
            managers[i] = new Manager();
            managers[i].accept();
        }

        // Find the manager with the maximum total salary
        Manager maxManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].getTotalSalary() > maxManager.getTotalSalary()) {
                maxManager = managers[i];
            }
        }

        // Display details of the manager with the maximum total salary
        System.out.println("\nManager with the highest total salary:");
        maxManager.display();
    }
}

