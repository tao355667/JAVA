package experiment.e8;

import java.io.*;

public class LX10_3 implements Serializable { //���л��ӿ�
    int bh = 1;
    int nl = 21;
    String xm;

    LX10_3(int bh, String xm, int nl) {//���췽��
        this.bh = bh;
        this.xm = xm;
        this.nl = nl;
    }

    LX10_3() {//���췽��
        this(0, "", 21);
    }

    void save(String fname) {//���浽�ļ��еķ���
        try {
            FileOutputStream fout = new FileOutputStream(fname);//����ļ���
            ObjectOutputStream out = new ObjectOutputStream(fout);//���������
            out.writeObject(this); //д�����
            out.close();
        } catch (FileNotFoundException fe) {
        } catch (IOException ioe) {
        }
    }

    void display(String fname) {//��ʾ�ļ��ж�����Ϣ�ķ���
        try {
            FileInputStream fin = new FileInputStream(fname);//�����ļ���
            ObjectInputStream in = new ObjectInputStream(fin);//���������
            LX10_3 OO = (LX10_3) in.readObject(); //��ȡ����
            System.out.println(" ������ " + OO.getClass().getName() + " " + OO.getClass().getInterfaces()[0]);
            System.out.println(" " + OO.bh + " " + OO.xm + " " + OO.nl);
            in.close();
        } catch (FileNotFoundException fe) {
        } catch (IOException ioe) {
        } catch (ClassNotFoundException ioe) {
        }
    }

    public static void main(String arg[]) {
        String fname = "LX10_3.obj";
        LX10_3 O1 = new LX10_3(1, "�ų�", 14);
        O1.save(fname);
        O1.display(fname);
    }
}
