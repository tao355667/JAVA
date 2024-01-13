package end_of_term.p14;
/*
编写自定义方法生成k个50～100之间的随机整数，再另写一个输出方法。
在应用程序的main( )方法中调用这两个方法，生成一个整型数组并输出该数组的所有元素。
*/
import java.util.Random;

//习题4.3.1
public class Super {

    static void randomCreate(int[] arrays, int k) {
        int temp;
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            temp = 50 + random.nextInt(51);
            arrays[i] = temp;
//            arrays[i] = 50 + random.nextInt(51);
        }
    }

    static void randomPrint(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public static void main(String[] args) {
        int[] arrays;
        int k = 10;
        arrays = new int[k];
        randomCreate(arrays, k);
        randomPrint(arrays);

    }


}
