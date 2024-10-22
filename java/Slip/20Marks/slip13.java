
//Q2. Define an interface “Operation” which has methods area(),volume(). Define a constant PI having
//value 3.142. Create a class circle (member – radius) which implements this interface. Calculate and
//display the area and volume.
//:-
interface Operation {
    double PI = 3.142;  // Constant PI

    double area();    // Method to calculate area
    double volume();  // Method to calculate volume
}

class Circle implements Operation {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // Calculate the area of the circle
        return PI * radius * radius;
    }

    @Override
    public double volume() {
        // Volume doesn't apply to a 2D circle, so return 0.
        return 0;
    }

    public void displayArea() {
        System.out.println("Area of the circle: " + area());
    }

    public void displayVolume() {
        System.out.println("Volume of the circle: " + volume());
    }
}
class slip13{
  	public static void main(String[] args) {
        double circleRadius = 5.0;  // Replace with your desired radius
        Circle circle = new Circle(circleRadius);

        circle.displayArea();
        circle.displayVolume();
    }
}
