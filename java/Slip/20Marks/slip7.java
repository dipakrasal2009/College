

//Q2. Define a class student having rollno, name and percentage. Define Default and
//parameterized constructor. Accept the 5 student details and display it. (Use this keyword
//:-
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double percentage;

    // Default constructor
    public Student() {
        this.rollNo = 0;
        this.name = "";
        this.percentage = 0.0;
    }

    // Parameterized constructor
    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Percentage: " + this.percentage + "%");
        System.out.println();
    }
}

 class slip7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Percentage: ");
            double percentage = scanner.nextDouble();

            students[i] = new Student(rollNo, name, percentage);
        }

        System.out.println("Student Details:");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}
