package experiment.e9;

public class MultiThreadExample{
    public static void main(String []args){//���߳�����
        new MyThread("A").start();//�����߳�A
        new MyThread("B").start();//�����߳�B
    }
}
