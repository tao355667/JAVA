/*
 * 6—Java循环语句
 */
package Java_basic.chapt_01_chapt_09;

public class _06_Loop {
    public static void main(String[] args) {
        // for
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + (i + 1) + "次for循环！");
        }
        System.out.println("for循环结束！");
        // while
        int num = 1;
        while (num <= 10) {
            System.out.println("第" + num + "次while循环！");
            num++;
        }
        System.out.println("while循环结束！");
        // do~while
        int num1 = 1;
        do {
            System.out.println("第" + num1 + "次do~while循环！");
            num1++;
        } while (num1 <= 10);
        System.out.println("do~while循环结束！");
        // for嵌套,输出坐标
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println("");
        }
        System.out.println("for嵌套循环结束！");
        // 使用if，break，continue改变处理流程
        // i小于10，i为偶数时，输出。
        for (int i = 0; i < 20; i++) {
            if (i > 10)
                break;
            if ((i & 1) == 1)
                continue;
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("使用if，break，continue改变处理流程结束！");
    }
}
