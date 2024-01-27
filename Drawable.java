public interface Drawable {
    public void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw(); // Output: "Drawing a circle."

    }
}

