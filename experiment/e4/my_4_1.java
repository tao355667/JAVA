/*
����һ����ΪMyRectangle�ľ����࣬������4��˽�е������򣬷ֱ��Ǿ��ε����Ͻ����꣨xUp,yUp�������½����꣨xDown,yDown����
���ж���û�в����Ĺ��췽������4��int�����Ĺ��췽����������ʼ�������
���л������·�����
getW( )����������εĿ�ȣ�
getH( )����������εĸ߶ȣ�
area( )����������ε������
toString( )�����Ѿ��εĿ��ߺ��������Ϣ��ΪΪ�ַ������ء�
��дӦ�ó���ʹ��MyRectangle�ࡣ
*/
package experiment;

class MyRectangle {
    public int xUp, yUp, xDown, yDown;

    public MyRectangle() {
        xUp = 0;
        yUp = 0;
        xDown = 0;
        yDown = 0;
    }
    public MyRectangle(int xUp,int yUp,int xDown,int yDown) {
        this.xUp = xUp;
        this.yUp = yUp;
        this.xDown = xDown;
        this.yDown = yDown;
    }
    public int getW(){
        return yDown-yUp;
    }
    public int getH(){
        return xDown-xUp;
    }
    public int area(){
        return (yDown-yUp)*(xDown-xUp);
    }
    public String toString(){
        return "W="+getW()+",H="+getW()+",area="+area();
    }
}

public class my_4_1 {
    public static void main(String[] args) {
        MyRectangle r1=new MyRectangle();
        MyRectangle r2=new MyRectangle(0,0,20,30);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
