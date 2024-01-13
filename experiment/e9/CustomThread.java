package experiment.e9;

class CustomThread implements Runnable{
    String name;
    public CustomThread(String n){
        name=n;
    }
    public void run(){
        Thread current=Thread.currentThread();//取得当前线程
        for(int i=0;i<5;i++){
            try{
                // 睡眠一段随机时间
                current.sleep((long)(Math.random() * 1000));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.print(name); //打印线程名称
        }
    }
}
