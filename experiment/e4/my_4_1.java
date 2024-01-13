/*
定义一个名为MyRectangle的矩形类，类中有4个私有的整型域，分别是矩形的左上角坐标（xUp,yUp）和右下角坐标（xDown,yDown）；
类中定义没有参数的构造方法和有4个int参数的构造方法，用来初始化类对象。
类中还有以下方法：
getW( )——计算矩形的宽度；
getH( )——计算矩形的高度；
area( )——计算矩形的面积；
toString( )——把矩形的宽、高和面积等信息作为为字符串返回。
编写应用程序使用MyRectangle类。
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
