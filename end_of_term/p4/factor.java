package end_of_term.p4;

import java.math.BigInteger;

public class factor {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");// �׳˺�,��ʼ��Ϊ0;
        for (int i = 1; i <= 30; i++) {
            sum = sum.add(factorial(i));  //�׳˺��ۼ�
            i++;
        }
        System.out.println("1!+2!+3!+��+30!=" + sum);
    }

    public static BigInteger factorial(int n) {    //����n�Ľ׳�
        BigInteger f = new BigInteger("1");   //�׳ˣ���ʼ��Ϊ1;
        if (n == 0)
            return f;           //0�Ľ׳�Ϊ1
        for (int i = 2; i <= n; i++) {          //����׳�
            BigInteger temp = new BigInteger(String.valueOf(i));
            f = f.multiply(temp);
        }
        return f;
    }

}
