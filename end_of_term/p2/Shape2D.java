package end_of_term.p2;

/*
定义一个接口Shape2D，利用它来实现二维的几何形状类Circle和Rectangle 面积计算编写实现接口的程序文件
*/
interface Shape2D {    //定义Shape2D接口
    final double pi = 3.14;    //数据成员一定要初始化

    public abstract double area();    //抽象方法，不需要定义处理方式
}
