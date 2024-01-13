package experiment.e6;

interface Shape2D {    //����Shape2D�ӿ�
    final double pi = 3.14;    //���ݳ�Աһ��Ҫ��ʼ��

    public abstract double area();    //���󷽷�������Ҫ���崦��ʽ
}

class Circle implements Shape2D {
    double radius;

    public Circle(double r) {    //���췽��
        radius = r;
    }

    public double area() {
        return (pi * radius * radius);
    }
}

class Rectangle implements Shape2D {
    int width, height;

    public Rectangle(int w, int h) {    //���췽��
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
