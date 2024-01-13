

import java.awt.*;
import java.applet.*;

public class BallApplet extends Applet implements Runnable {
    Thread t; // �̱߳���
    int x, y, y0, v0, t0; // С���ʼλ�ú��ٶ�
    int time; // ������ʱ��
    int maxX, maxY; // ������С
    double g; // �������ٶ�

    public void init() {
        setBackground(Color.WHITE);
        maxX = getWidth() - 1;
        maxY = getHeight() - 1;
        g = 9.8; // �����������ٶ�Ϊ9.8m/s^2
        x = 50; // С��ĳ�ʼx����
        y0 = 50; // С��ĳ�ʼy����
        v0 = 20; // С��ĳ�ʼ�ٶ�
        t0 = 0; // С��ĳ�ʼʱ��
        time = 0; // ������ʱ���ʼֵΪ0
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (t != null) {
            // ����С����˶��켣
            Graphics g = getGraphics();
            g.setColor(Color.RED);
            g.fillOval(x, y, 20, 20); // ����С��
            try {
                t.sleep(100);
            } catch (InterruptedException e) {}

            // С����˶��켣
            double t = (time - t0) / 10.0; // ʱ��ĵ�λΪ0.1s
            double a = 10;
            y = (int)(y0 + v0*t + 0.5*a*t*t);
            if (y > maxY - 20) {
                y = maxY - 20;
                y0 = y;
                v0 = -v0; // С�򷴵�
                t0 = time;
            }
            x = (x + 5) % maxX; // ģ��ˮƽƽ���˶�����50����/����ٶ������ƶ�
            time += 1; // �����˶�ʱ��
            repaint();
        }
    }

    public void stop() {
        t = null;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine(0, maxY-20, maxX, maxY-20); // ���Ƶ���
    }
}
