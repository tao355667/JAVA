/*
 * 7—Java数组
 */
package Java_basic.chapt_01_chapt_09;

import java.io.*;

public class _07_Array {
    public static void main(String[] args) {
        // 1 定义数组
        System.out.println("1 定义数组");
        int[] arr1;
        arr1 = new int[5];
        // 给数组赋值
        arr1[0] = 81;
        arr1[1] = 88;
        arr1[2] = 25;
        arr1[3] = 66;
        arr1[4] = 77;
        // 打印数组中的元素
        for (int i = 0; i < 5; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        // 2 不能超范围访问
        // arr1[10]=32;//错误
        // 3 自定义数组长度
        System.out.println("3 自定义数组长度");
        System.out.println("请输入数组长度");
        int arr2len = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            arr2len = Integer.parseInt(str);
        } catch (Exception e) {
            // TODO: handle exception
        }
        int[] arr2 = new int[arr2len];
        System.out.println("新建数组,长度为" + arr2.length);
        // 4 数组变量的赋值
        System.out.println("4 数组变量的赋值");
        int[] test1 = arr1;// test1和test2指向同一片内存空间
        int[] test2 = arr1;
        for (int i = 0; i < 5; i++) {
            System.out.print("test1[" + i + "] = " + test1[i]);
            System.out.println("    test2[" + i + "] = " + test2[i]);
        }
        // 5 数组初始化,排序
        System.out.println("5 数组初始化,排序");
        int[] arr3 = { 1, 2, 3, 4, 5 };
        System.out.print("arr3 = ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        // 选择排序
        for (int i = 0; i < arr3.length - 1; i++) {
            int maxlow = i;
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[j] > arr3[maxlow]) {
                    maxlow = j;
                }
            }
            int temp = arr3[i];
            arr3[i] = arr3[maxlow];
            arr3[maxlow] = temp;
        }
        System.out.print("arr3 = ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        // 6 多维数组
        System.out.println("6 多维数组");
        int[][] arr4;
        System.out.println("arr4=");
        arr4 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr4[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr4[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("变长数组  arr5=");
        int[][] arr5 = { { 2, 4, 5, }, { 9, 9, 999, 545, 65 }, { 1 } };
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
