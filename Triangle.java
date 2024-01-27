public class Triangle {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        int getParameter() {
            return side1+side2+side3;
        }

        double getArea() {
            return side1*side2*0.5;
        }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("The parameter is " + triangle.getParameter());
        System.out.println("The area is " + triangle.getArea());

    }
}