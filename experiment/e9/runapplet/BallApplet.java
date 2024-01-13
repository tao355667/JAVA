

import java.awt.*;
import java.applet.*;

public class BallApplet extends Applet implements Runnable {
    Thread t; // 线程变量
    int x, y, y0, v0, t0; // 小球初始位置和速度
    int time; // 经过的时间
    int maxX, maxY; // 画布大小
    double g; // 重力加速度

    public void init() {
        setBackground(Color.WHITE);
        maxX = getWidth() - 1;
        maxY = getHeight() - 1;
        g = 9.8; // 假设重力加速度为9.8m/s^2
        x = 50; // 小球的初始x坐标
        y0 = 50; // 小球的初始y坐标
        v0 = 20; // 小球的初始速度
        t0 = 0; // 小球的初始时间
        time = 0; // 经过的时间初始值为0
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (t != null) {
            // 绘制小球的运动轨迹
            Graphics g = getGraphics();
            g.setColor(Color.RED);
            g.fillOval(x, y, 20, 20); // 绘制小球
            try {
                t.sleep(100);
            } catch (InterruptedException e) {}

            // 小球的运动轨迹
            double t = (time - t0) / 10.0; // 时间的单位为0.1s
            double a = 10;
            y = (int)(y0 + v0*t + 0.5*a*t*t);
            if (y > maxY - 20) {
                y = maxY - 20;
                y0 = y;
                v0 = -v0; // 小球反弹
                t0 = time;
            }
            x = (x + 5) % maxX; // 模拟水平平抛运动，以50像素/秒的速度向右移动
            time += 1; // 增加运动时间
            repaint();
        }
    }

    public void stop() {
        t = null;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine(0, maxY-20, maxX, maxY-20); // 绘制地面
    }
}
