
//Q2. Define a class Student with attributes rollno and name. Define default and parameterized
//constructor. Keep the count of Objects created. Create objects using parameterized constructor and
//Display the object count after each object is created.
//:-
class Student {
    private int rollno;
    private String name;
    private static int objectCount = 0;

    public Student() {
        objectCount++;
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

class slip17 {
    public static void main(String[] args) {
        Student student1 = new Student(); // Create an object using the default constructor
        System.out.println("Object count after student1: " + Student.getObjectCount());

        Student student2 = new Student(101, "Alice"); // Create an object using the parameterized constructor
        System.out.println("Object count after student2: " + Student.getObjectCount());

        Student student3 = new Student(102, "Bob"); // Create another object using the parameterized constructor
        System.out.println("Object count after student3: " + Student.getObjectCount());
    }
}

