import java.util.*;
import java.math.*;
import java.io.*;


public class test {

    static void operate(StringBuilder x, StringBuilder y) {
        x.append(y);//x改了
        y = x;//y没变
    }

    public static void main(String[] args) {
//        int arr0[] = {1, 2, 3, 4, 5};
//        int[] arr1 = new int[5];
//        String str = new String("abc");
//        str.concat("def");
//        System.out.println(str);
//        str = "abc" + "def";
//        System.out.println(str);
//        str += "def";
//        System.out.println(str);
        int[][] n = {{1, 2}, {2, 3},};
        int n1[][] = {{1, 2}, {2, 3},};
        int[] n2=new int[10];
        int n3[]=new int[10];
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        operate(a, b);
        System.out.println(a + "," + b);
        float fi = (float)3.14159 ;
    }
}


