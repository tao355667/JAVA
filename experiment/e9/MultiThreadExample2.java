package experiment.e9;
//���߳�ʾ��2
public class MultiThreadExample2{
    public static void main(String []args){
        Thread t1=new Thread(new CustomThread("A"));
        Thread t2=new Thread(new CustomThread("B"));
        t1.start();//�����߳�A
        t2.start();//�����߳�B
    }
}
