package end_of_term.p2;

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
