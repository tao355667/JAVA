

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class BallThread extends Applet implements Runnable{
    Thread red, blue;
    Graphics redPen, bluePen;
    int t=0;

    public void init(){
        red = new Thread(this);
        blue = new Thread(this);
        redPen = getGraphics();
        bluePen = getGraphics();
        redPen.setColor(Color.red);
        bluePen.setColor(Color.blue);
    }
    public void start(){
        red.start();
        blue.start();
    }

    public void run(){
        while(true){
            t=t+1;
            if(Thread.currentThread()==red){
                if(t>100)t=0;
                redPen.clearRect(0,0,110,400);
                redPen.fillOval(50,(int)(1.0/2*t*9.8),15,15);
                try{
                    red.sleep(40);
                }catch(InterruptedException e){}
            }else if(Thread.currentThread()==blue){
                bluePen.clearRect(120,0,900,500);
                bluePen.fillOval(120+7*t,(int)(1.0/2*t*9.8),15,15);
                try{
                    blue.sleep(40);
                }catch(InterruptedException e){}
            }
        }
    }
}
