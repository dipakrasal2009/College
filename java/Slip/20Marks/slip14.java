

//Q2. Define an interface “Operation” which has methods area(),volume(). Define a constant PI having a
//value 3.142. Create a class cylinder (members – radius, height) which implements this interface. Calculate and display the area and volume. [20 Marks]
//:-
//
interface Operation {
    double PI = 3.142; // Constant PI

    double area();   // Method to calculate area
    double volume(); // Method to calculate volume
}

class Cylinder implements Operation {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        // Formula for the surface area of a cylinder: 2 * PI * radius * (radius + height)
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        // Formula for the volume of a cylinder: PI * radius^2 * height
        return PI * Math.pow(radius, 2) * height;
    }

    public void displayResults() {
        System.out.println("Cylinder Area: " + area());
        System.out.println("Cylinder Volume: " + volume());
    }
}
class slip14 {
    public static void main(String[] args) {
        double radius = 5.0;
        double height = 10.0;

        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.displayResults();
    }
}

