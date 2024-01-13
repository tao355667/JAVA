package experiment;

class Circle {
    private int radius;

    Circle(int r) {
        setRadius(r);
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double area() {
        return 3.14159 * radius * radius;
    }

    public String toString() {
        return "Ô²°ë¾¶£º" + getRadius() + " Ô²Ãæ»ý£º" + area();
    }
}

public class LX5_3 {
    public static void main(String args[]) {
        Circle c = new Circle(10);
        System.out.println("\n" + c.toString());
    }
}
