package experiment.e9;
//多线程示例2
public class MultiThreadExample2{
    public static void main(String []args){
        Thread t1=new Thread(new CustomThread("A"));
        Thread t2=new Thread(new CustomThread("B"));
        t1.start();//启动线程A
        t2.start();//启动线程B
    }
}
