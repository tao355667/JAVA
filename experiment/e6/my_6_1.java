/*
定义一个抽象基类Shape，它包含三个抽象方法center()、diameter()、getArea()，从Shape类派生出Square和Circle类，
这两个类都用center()计算对象的中心坐标，diameter()计算对象的外界圆直径，getArea()方法计算对象的面积。
编写编写应用程序使用Rectangle类和Circle类。
*/
package experiment;

abstract class Shape {
    public abstract double[] center();
    public abstract double diameter();
    public abstract double getArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double[] center() {
        return new double[]{side/2, side/2};
    }

    public double diameter() {
        return side * Math.sqrt(2);
    }

    public double getArea() {
        return side * side;
    }
}

class Circle_6_1 extends Shape {
    private double radius;

    public Circle_6_1(double radius) {
        this.radius = radius;
    }

    public double[] center() {
        return new double[]{0, 0};
    }

    public double diameter() {
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}


public class my_6_1 {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square center: (" + square.center()[0] + ", " + square.center()[1] + ")");
        System.out.println("Square diameter: " + square.diameter());
        System.out.println("Square area: " + square.getArea());

        Circle_6_1 circle = new Circle_6_1(3);
        System.out.println("Circle center: (" + circle.center()[0] + ", " + circle.center()[1] + ")");
        System.out.println("Circle diameter: " + circle.diameter());
        System.out.println("Circle area: " + circle.getArea());
    }
}
