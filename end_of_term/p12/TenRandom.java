package end_of_term.p12;
import java.util.Random;
import java.util.ArrayList;
/*��д��������10����ͬ��������������*/
public class TenRandom {
    public static void main(String[] args) {
        ArrayList<Integer> dr=new ArrayList<Integer>(10);
        int temp,k=0;

        while(k<10)
        {
            Random rd=new Random();
            temp=rd.nextInt(50);
            if(dr.contains(temp))
                continue;
//            dr.add(Integer.valueOf(temp));
            dr.add(temp);
            k++;
        }
        for(int i=0;i<10;i++)
            System.out.print(" "+dr.get(i));
    }
}
