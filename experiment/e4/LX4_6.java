package experiment;

class LX4_6 {
    public static void main(String[] args) {
        Power p=new Power();
        p.ff2(10,10);
        System.out.println("�������ú� x="+p.x+", y="+p.y);
    }
}
class Power{
    int x=10, y=10;
    void ff2(int passX, int passY) {
        System.out.println("��ʼʱ x="+x+", y="+y);
        x=passX*passX;
        y=passY*passY;
        System.out.println("���������� x="+x+", y="+y);
    }
}
