package experiment.e9;

public class MultiThreadExample{
    public static void main(String []args){//多线程例子
        new MyThread("A").start();//启动线程A
        new MyThread("B").start();//启动线程B
    }
}
