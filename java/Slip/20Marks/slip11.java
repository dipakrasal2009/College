

//Q2. Create an abstract class Shape with methods area & volume. Derive a class Sphere (radius). Calculate and display area and volume. [20 Marks]
//:-
import java.lang.Math;

// Abstract class Shape
abstract class Shape {
    // Abstract method for calculating area
    abstract double area();

    // Abstract method for calculating volume
    abstract double volume();
}

// Derived class Sphere
class Sphere extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implementation of the area method for a sphere
    @Override
    double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Implementation of the volume method for a sphere
    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class slip11 {
    public static void main(String[] args) {
        double radius = 5.0; // Replace with your desired radius

        // Create a Sphere object
        Sphere sphere = new Sphere(radius);

        // Calculate and display the area and volume of the sphere
        System.out.println("Sphere Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.volume());
    }
}

