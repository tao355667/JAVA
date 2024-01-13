package end_of_term.p4;

import java.math.BigInteger;

public class factor {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");// 阶乘和,初始化为0;
        for (int i = 1; i <= 30; i++) {
            sum = sum.add(factorial(i));  //阶乘和累加
            i++;
        }
        System.out.println("1!+2!+3!+…+30!=" + sum);
    }

    public static BigInteger factorial(int n) {    //返回n的阶乘
        BigInteger f = new BigInteger("1");   //阶乘，初始化为1;
        if (n == 0)
            return f;           //0的阶乘为1
        for (int i = 2; i <= n; i++) {          //计算阶乘
            BigInteger temp = new BigInteger(String.valueOf(i));
            f = f.multiply(temp);
        }
        return f;
    }

}
