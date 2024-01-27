import java.util.ArrayList;

public class Shape {

    void calculateArea(){
        System.out.println("calA  is called");
    }

    void displayArea(){
        System.out.println("disA is called");
    }

    public static void main(String[] args){
        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(new Circle());
        list.add(new Rectangle());
        for (Shape shape:list){
            shape.calculateArea();
            shape.displayArea();
        }
    }

}

class Circle extends Shape{
    int radius = 10;
    double area;
    void calculateArea(){
        area = Math.PI*radius*radius;
    }
    void displayArea(){
        System.out.println(area);
    }
}

class Rectangle extends Shape{
    int length = 10;
    int wide = 5;
    double area;
    void calculateArea() {
        area = length*wide;
    }

    void displayArea(){
        System.out.println(area);
    }
}

