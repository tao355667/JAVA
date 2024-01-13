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
        System.out.println("现在时间是:" + temp);
        System.out.println("toString:" + date2.toString());
        System.out.println("toLocalString:" + date2.toLocaleString());
        System.out.println("toString:" + date2.toGMTString());
        System.out.println("年:" + String.valueOf(Integer.parseInt(String.valueOf(date2.getYear())) + 1900));
        System.out.println("月:" + (date2.getMonth()+1));
        System.out.println("月:" + date2.getDate());
        System.out.println("日:" + date2.getDay());
        System.out.println("小时数:" + date2.getHours());
        System.out.println("分钟数:" + date2.getMinutes());
        System.out.println("秒数:" + date2.getSeconds());
    }

}
