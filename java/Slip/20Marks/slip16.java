
//Q2. Write a program to create a super class Employee (members – name, salary). Derive a sub- class
//Programmer (member – proglanguage). Create object of Programmer and display the details of it. 
//:-
class SuperEmp {
    String name;
    double salary;

    public SuperEmp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Programmer extends SuperEmp {
    String proglanguage;

    public Programmer(String name, double salary, String proglanguage) {
        super(name, salary);
        this.proglanguage = proglanguage;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + proglanguage);
    }
}

class slip16 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Doe", 60000.0, "Java");
        programmer.displayDetails();
    }
}

