

//Q2. Define a “Point” class having members – x,y(coordinates). Define default constructor and
//parameterized constructors. Define subclass “Point3D” with member as z (coordinate). Write display
//method to show the details of Point.
// :-
class Point {
     int x;
     int y;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class Point3D extends Point {
    private int z;

    // Parameterized constructor for Point3D
    public Point3D(int x, int y, int z) {
        super(x, y); // Call the parameterized constructor of the superclass
        this.z = z;
    }

    @Override
    public void display() {
        System.out.println("Point3D: (" + super.x + ", " + super.y + ", " + z + ")");
    }
}

 class slip9 {
    public static void main(String[] args) {
        Point point2D = new Point(1, 2);
        Point3D point3D = new Point3D(3, 4, 5);

        point2D.display(); // Display the 2D point
        point3D.display(); // Display the 3D point
    }
}
            
