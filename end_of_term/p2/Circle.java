package end_of_term.p2;

class Circle implements Shape2D{
    double radius;
    public Circle(double r){	//���췽��
        radius=r;
    }
    public double area(){
        return (pi * radius * radius);
    }
}
