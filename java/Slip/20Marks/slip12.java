
//Q2. Create an abstract class Shape with methods area & volume. Derive a class Cylinder (radius, height). Calculate area and volume.
//:-
abstract class Shape {
    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double area();

    // Abstract method to calculate volume (to be implemented by subclasses)
    public abstract double volume();
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor for the Cylinder class
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        // Calculate the surface area of the cylinder
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        // Calculate the volume of the cylinder
        return Math.PI * radius * radius * height;
    }
}

class slip12 {
    public static void main(String[] args) {
        // Create a Cylinder object with a radius of 3.0 and a height of 5.0
        Cylinder myCylinder = new Cylinder(3.0, 5.0);

        // Calculate and print the area and volume of the cylinder
        System.out.println("Cylinder Area: " + myCylinder.area());
        System.out.println("Cylinder Volume: " + myCylinder.volume());
    }
}
