package experiment.e6;

import java.util.*; //����java.util ��
public class  LX6_1_YMD {
    private int year,month,day;
    public static void main(String[] arg3){}
    public  LX6_1_YMD(int y,int m,int d) {
        year = y;
        month = (((m>=1) & (m<=12)) ? m : 1);
        day = (((d>=1) & (d<=31)) ? d : 1);
    }
    public  LX6_1_YMD() {
        this(0,0,0);
    }
    public static int thisyear() {
        return Calendar.getInstance().get(Calendar.YEAR);//���ص�������
    }
    public int year() {
        return year;//�������
    }
    public String toString(){
        return year+"-"+month+"-"+day;//����ת��Ϊ�ַ�������-��-��
    }
}
