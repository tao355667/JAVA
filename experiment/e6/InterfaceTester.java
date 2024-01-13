package experiment.e6;

interface Shape2D {    //定义Shape2D接口
    final double pi = 3.14;    //数据成员一定要初始化

    public abstract double area();    //抽象方法，不需要定义处理方式
}

class Circle implements Shape2D {
    double radius;

    public Circle(double r) {    //构造方法
        radius = r;
    }

    public double area() {
        return (pi * radius * radius);
    }
}

class Rectangle implements Shape2D {
    int width, height;

    public Rectangle(int w, int h) {    //构造方法
        width = w;
        height = h;
    }

    public double area() {
        return (width * height);
    }
}

public class InterfaceTester {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle(5, 6);
        System.out.println("Area of rect = " + rect.area());
        Circle cir = new Circle(2.0);
        System.out.println("Area of cir = " + cir.area());
    }
}
