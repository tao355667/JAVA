package experiment.e9;

class MyThread extends Thread{
    public MyThread(String n){//有参构造函数
        super(n); //线程名称
    }
    public void run(){
        for(int i=0;i<5;i++){
            try{
                // 睡眠一段随机时间
                Thread.sleep((long)(Math.random() * 1000));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.print(getName()); //打印线程名称
        }
    }
}
