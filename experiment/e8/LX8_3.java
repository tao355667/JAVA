package experiment.e8;

class LX8_3 {
    public static void main(String[] args) throws java.io.IOException {
        byte buffer[] = new byte[10];
        System.out.println("�Ӽ������벻����10 ���ַ������س����������룺");
        int count = System.in.read(buffer);//��ȡ������ַ�������ڻ�����buffer ��
        System.out.println("�����ڻ�����buffer ��Ԫ�صĸ���Ϊ��" + count);
        System.out.println("buffer �и�Ԫ�ص�ֵΪ��");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + buffer[i]);//����Ļ����ʾbuffer Ԫ�ص�ֵ
        }
        System.out.println();
        System.out.println("���buffer �ַ�Ԫ�أ�");
        System.out.write(buffer, 0, buffer.length);
    }
}
