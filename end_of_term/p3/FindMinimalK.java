package end_of_term.p3;

/*
��֪sum(k)=1+2+3+L+k ���� ��СΪʲôֵ�ܹ�ʹ�� sum(k)>2000?
*/
public class FindMinimalK {
    public static void main(String[] args) {
        int sum = 1;
        int k = 1;
        while (sum <= 2000) {
            k++;
            sum = sum + k;
        }
        System.out.println("the minimal k=" + k);
    }

}
