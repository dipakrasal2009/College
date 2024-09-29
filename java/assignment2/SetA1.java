// Base class Point
class Point {
    protected int x, y;

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display method
    public void display() {
        System.out.println("Point [x=" + x + ", y=" + y + "]");
    }
}

// Subclass ColorPoint (extends Point)
class ColorPoint extends Point {
    private String color;

    // Default constructor
    public ColorPoint() {
        super();
        this.color = "Unknown";
    }

    // Parameterized constructor
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    // Display method (overrides Point's display)
    @Override
    public void display() {
        System.out.println("ColorPoint [x=" + x + ", y=" + y + ", color=" + color + "]");
    }
}

// Subclass Point3D (extends Point)
class Point3D extends Point {
    protected int z;

    // Default constructor
    public Point3D() {
        super();
        this.z = 0;
    }

    // Parameterized constructor
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // Display method (overrides Point's display)
    @Override
    public void display() {
        System.out.println("Point3D [x=" + x + ", y=" + y + ", z=" + z + "]");
    }
}

// Main class to test the program
public class SetA1 {
    public static void main(String[] args) {
        // Create different types of points
        Point point = new Point(2, 3);
        ColorPoint colorPoint = new ColorPoint(5, 7, "Red");
        Point3D point3D = new Point3D(1, 4, 9);

        // Display the details
        point.display();
        colorPoint.display();
        point3D.display();
    }
}
