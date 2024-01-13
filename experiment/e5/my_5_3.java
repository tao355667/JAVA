/*
3. �Ե�����Ϊ���࣬�ӵ�������Բ����Բ����Բ������Ƴ�Ա����������ǵ�����������
*/
package experiment;

class Point_1 {
    private int x, y;

    public Point_1() {
        this.x = 0;
        this.y = 0;
    }

    public Point_1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Circle_1 extends Point_1 {
    int radius;

    public Circle_1() {
        super();
        radius = 0;
    }

    public Circle_1(int x, int y, int r) {
        super(x, y);
        radius = r;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.1415926 * radius * radius;
    }
}

class Cylinder extends Circle_1 {
    private int heigh;

    public Cylinder(int x, int y, int r, int h) {
        super(x, y, r);
        heigh = h;
    }

    public Cylinder() {
        super();
        heigh = 0;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public double getVolume() {
        return getArea() * heigh;
    }
}

public class my_5_3 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(0, 0, 5, 6);
        System.out.println("c1�ĵ���� = " + c1.getArea());
        System.out.println("c1����� = " + c1.getVolume());
    }
}
