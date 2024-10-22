

//Q2. Create an employee class (id,name,deptname,salary). Define a default and parameterized
//constructor. Use ‘this’ keyword to initialize instance variables. Keep a count of objects created. Create objects using parameterized constructor and display the object count after each object is
//created. Also display the contents of each object. 
//:-
public class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;
    private static int objectCount = 0;

    public Employee() {
        objectCount++;
    }

    public Employee(int id, String name, String deptName, double salary) {
        this();  // Calls the default constructor to increment objectCount
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        displayObjectDetails();
    }

    public void displayObjectDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department Name: " + deptName);
        System.out.println("Salary: $" + salary);
        System.out.println("Total Employee Objects Created: " + objectCount);
        System.out.println("---------------");
    }
}
class slip20{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", "HR", 50000);
        Employee emp2 = new Employee(2, "Alice Smith", "IT", 60000);
    }
}

