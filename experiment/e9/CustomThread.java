package experiment.e9;

class CustomThread implements Runnable{
    String name;
    public CustomThread(String n){
        name=n;
    }
    public void run(){
        Thread current=Thread.currentThread();//ȡ�õ�ǰ�߳�
        for(int i=0;i<5;i++){
            try{
                // ˯��һ�����ʱ��
                current.sleep((long)(Math.random() * 1000));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.print(name); //��ӡ�߳�����
        }
    }
}
