package experiment.e9;

class MyThread extends Thread{
    public MyThread(String n){//�вι��캯��
        super(n); //�߳�����
    }
    public void run(){
        for(int i=0;i<5;i++){
            try{
                // ˯��һ�����ʱ��
                Thread.sleep((long)(Math.random() * 1000));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.print(getName()); //��ӡ�߳�����
        }
    }
}
