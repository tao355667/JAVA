package end_of_term.p13;
/*
使用Scanner类的实例解析字符串："数学87分，物理76分，英语96分"中的考试成绩，并计算出总成绩以及平均分数
*/

import java.util.*;

public class Jiexi {
    public static void main(String args[]) {
        String cost = " 数学 87 分，物理 76 分，英语 96 分";
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^0123456789.]+");//设置分隔符
        double sum = 0;
        int count = 0;
        while (scanner.hasNext()) {
            try {
                double score = scanner.nextDouble();
                count++;//几个成绩
                sum = sum + score;//总成绩
                System.out.println(score);
            } catch (InputMismatchException exp) {
                String t = scanner.next();
            }
        }
        System.out.println(" 总分 :" + sum + " 分");
        System.out.println(" 平均分 :" + sum / count + " 分");
    }
}
