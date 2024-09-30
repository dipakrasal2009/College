import java.util.Scanner;

// Define an interface "Operation" with methods area() and volume(), and constant PI
interface Operation {
    double PI = 3.142;  // constant value for PI

    // Methods to calculate area and volume
    double area();
    double volume();
}

// Circle class implementing the Operation interface
class Circle implements Operation {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area() method to calculate the area of a circle
    @Override
    public double area() {
        return PI * radius * radius;  // Area of a circle = PI * r^2
    }

    // Override volume() method (but volume for a circle is 0)
    @Override
    public double volume() {
        return 0;  // Circle doesn't have a volume
    }
}

// Cylinder class implementing the Operation interface
class Cylinder implements Operation {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override area() method to calculate the surface area of the cylinder
    @Override
    public double area() {
        // Surface Area of a Cylinder = 2 * PI * r * (r + h)
        return 2 * PI * radius * (radius + height);
    }

    // Override volume() method to calculate the volume of the cylinder
    @Override
    public double volume() {
        // Volume of a Cylinder = PI * r^2 * h
        return PI * radius * radius * height;
    }
}

public class SetB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle Example
        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Volume: " + circle.volume());  // Will return 0 as circles don't have volume

        // Cylinder Example
        System.out.print("\nEnter the radius of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
        
        scanner.close();
    }
}

