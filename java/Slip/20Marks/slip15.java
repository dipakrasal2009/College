



//Q2. Write a program to create a super class Employee (members – name, salary). Derive a sub- classas Developer (member – projectname). Create object of Developer and display the detailsof it. :-

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Developer extends Employee {
    String projectName;

    public Developer(String name, double salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Project Name: " + projectName);
    }
}

class slip15 {
    public static void main(String[] args) {
        Developer developer = new Developer("John Doe", 60000.0, "Project X");
        developer.displayDetails();
    }
}
                                                                

