package end_of_term.p3;

/*
已知sum(k)=1+2+3+L+k ，问 最小为什么值能够使得 sum(k)>2000?
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
