package experiment;

import java.util.*;

public class HelloWorld {
    public static void main(String args[]) {
        Date date1 = new Date();
        String temp = date1.toString();
        temp = temp.substring(11, temp.indexOf('C'));
        System.out.println(temp);
        double sum = 0.0;
        for (int i = 0; i <= 10000000; i++) {
            sum += i;
        }
        System.out.println("" + sum);
        Date date2 = new Date();
        temp = date2.toString();
        temp = temp.substring(11, temp.indexOf('C'));
        System.out.println("����ʱ����:" + temp);
        System.out.println("toString:" + date2.toString());
        System.out.println("toLocalString:" + date2.toLocaleString());
        System.out.println("toString:" + date2.toGMTString());
        System.out.println("��:" + String.valueOf(Integer.parseInt(String.valueOf(date2.getYear())) + 1900));
        System.out.println("��:" + (date2.getMonth()+1));
        System.out.println("��:" + date2.getDate());
        System.out.println("��:" + date2.getDay());
        System.out.println("Сʱ��:" + date2.getHours());
        System.out.println("������:" + date2.getMinutes());
        System.out.println("����:" + date2.getSeconds());
    }

}
