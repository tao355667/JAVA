package end_of_term.p14;
/*
��д�Զ��巽������k��50��100֮����������������дһ�����������
��Ӧ�ó����main( )�����е�������������������һ���������鲢��������������Ԫ�ء�
*/
import java.util.Random;

//ϰ��4.3.1
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
