
//Q2. Define a “Point” class having members – x,y (coordinates). Define default constructor and
//parameterized constructors. Define subclass “ColorPoint” with member as color. Write display
//method to display the details of Point
//:-

class Point {
     int x;
     int y;

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

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    // Parameterized constructor
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("ColorPoint: (" + super.x + ", " + super.y + "), Color: " + color);
    }
}

public class slip5 {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(3, 4);
        ColorPoint colorPoint = new ColorPoint(1, 2, "Red");


        point1.display();
        point2.display();
        colorPoint.display();

    }
}
