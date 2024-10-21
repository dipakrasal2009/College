
//Q2. Write a program which define class Employee with data member as id, name and salary Store
//the information of 'n' employees and Display the name of employee having maximum salary (Use
//array of object).
//:-
//
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
//employeemain
 class slip6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " details:");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        // Find the employee with the maximum salary
        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < n; i++) {
            if (employees[i].salary > maxSalaryEmployee.salary) {
                maxSalaryEmployee = employees[i];
            }
        }

        System.out.println("Employee with the maximum salary:");
        System.out.println("Name: " + maxSalaryEmployee.name);
        System.out.println("Salary: " + maxSalaryEmployee.salary);

        sc.close();
    }
}
