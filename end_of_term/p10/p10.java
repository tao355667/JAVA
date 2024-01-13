package end_of_term.p10;

/*
已知a(1)=1，a(2)=2，a(3)=6，…，a(n)=a(n-3)+a(n-2)+a(n-1)  (n>3)；
用Java编程求出a(12)和a(14)项。
*/
public class p10 {
    public static void main(String[] args) {
        int[] a = new int[100];
        a[1]=1;
        a[2]=2;
        a[3]=6;
        for (int i = 4; i <= 14; i++) {
            a[i]=a[i-1]+a[i-2]+a[i-3];
        }
        System.out.println("a[12]="+a[12]+",a[14]="+a[14]);
    }

}
