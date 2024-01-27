abstract class Shape {
    abstract double calculateArea();

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle area: " + rectangleArea); // Output: Rectangle area: 50.0

        Triangle triangle = new Triangle(3, 4);
        double triangleArea = triangle.calculateArea();
        System.out.println("Triangle area: " + triangleArea); // Output: Triangle area: 6.0

    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

